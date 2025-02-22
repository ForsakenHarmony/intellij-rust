/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.cargo.runconfig

import com.google.common.annotations.VisibleForTesting
import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.ProgramRunner
import com.intellij.execution.testframework.autotest.ToggleAutoTestAction
import com.intellij.notification.NotificationType
import com.intellij.openapi.util.SystemInfo
import org.rust.RsBundle
import org.rust.cargo.runconfig.buildtool.CargoPatch
import org.rust.cargo.runconfig.command.CargoCommandConfiguration
import org.rust.cargo.runconfig.console.CargoTestConsoleBuilder
import org.rust.cargo.toolchain.CargoCommandLine
import org.rust.cargo.toolchain.RustChannel
import org.rust.cargo.toolchain.impl.RustcVersion
import org.rust.cargo.util.parseSemVer
import org.rust.ide.notifications.showBalloon
import java.time.LocalDate

class CargoTestRunState(
    environment: ExecutionEnvironment,
    runConfiguration: CargoCommandConfiguration,
    config: CargoCommandConfiguration.CleanConfiguration.Ok
) : CargoRunStateBase(environment, runConfiguration, config) {
    private val cargoTestPatch: CargoPatch = { commandLine ->
        val rustcVer = cargoProject?.rustcInfo?.version
        // TODO: always pass `withSudo` when `com.intellij.execution.process.ElevationService` supports error stream redirection
        // https://github.com/intellij-rust/intellij-rust/issues/7320
        if (commandLine.withSudo) {
            val message = if (SystemInfo.isWindows) {
                RsBundle.message("notification.run.tests.as.root.windows")
            } else {
                RsBundle.message("notification.run.tests.as.root.unix")
            }
            project.showBalloon(message, NotificationType.WARNING)
        }
        commandLine.copy(additionalArguments = patchArgs(commandLine, rustcVer), emulateTerminal = false, withSudo = false)
    }

    init {
        consoleBuilder = CargoTestConsoleBuilder(environment.runProfile as CargoCommandConfiguration, environment.executor)
        commandLinePatches.add(cargoTestPatch)
        createFilters(cargoProject).forEach { consoleBuilder.addFilter(it) }
    }

    override fun execute(executor: Executor, runner: ProgramRunner<*>): ExecutionResult {
        val processHandler = startProcess()
        val console = createConsole(executor)
        console?.attachToProcess(processHandler)
        return DefaultExecutionResult(console, processHandler).apply { setRestartActions(ToggleAutoTestAction()) }
    }

    companion object {

        @VisibleForTesting
        fun patchArgs(commandLine: CargoCommandLine, rustcVer: RustcVersion?): List<String> {
            val (pre, post) = commandLine.splitOnDoubleDash()
                .let { (pre, post) -> pre.toMutableList() to post.toMutableList() }

            val noFailFastOption = "--no-fail-fast"
            if (noFailFastOption !in pre) {
                pre.add(noFailFastOption)
            }

            val unstableOption = "-Z"
            if (unstableOption !in post) {
                post.add(unstableOption)
                post.add("unstable-options")
            }

            addFormatJsonOption(post, "--format", "json")

            if (checkShowOutputSupport(rustcVer)) {
                post.add("--show-output")
            }

            return if (post.isEmpty()) pre else pre + "--" + post
        }

        private fun checkShowOutputSupport(ver: RustcVersion?): Boolean {
            if (ver == null) return false
            // --show-output is supported since 1.39.0-nightly/dev with a build date later than 2019-08-27
            val minRelease = "1.39.0".parseSemVer()
            val commitDate = LocalDate.of(2019, 8, 27)
            return when {
                ver.semver > minRelease -> true
                ver.semver < minRelease -> false
                else ->
                    ver.channel.index <= RustChannel.BETA.index || ver.commitDate?.isAfter(commitDate) ?: false
            }
        }
    }
}
