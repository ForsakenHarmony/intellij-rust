/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

package org.rust.cargo.project.configurable

import com.intellij.execution.configuration.EnvironmentVariablesComponent
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.ComboBox
import com.intellij.openapi.ui.DialogPanel
import com.intellij.ui.RawCommandLineEditor
import com.intellij.ui.components.Label
import com.intellij.ui.layout.panel
import com.intellij.ui.layout.toBinding
import org.rust.RsBundle
import org.rust.cargo.project.settings.RustfmtProjectSettingsService
import org.rust.cargo.project.settings.rustSettings
import org.rust.cargo.project.settings.rustfmt
import org.rust.cargo.toolchain.RustChannel
import javax.swing.JLabel

class RustfmtConfigurable(project: Project) : RsConfigurableBase(project, RsBundle.message("settings.rust.rustfmt.name")) {
    private val settings: RustfmtProjectSettingsService = project.rustSettings.rustfmt

    private val additionalArguments: RawCommandLineEditor = RawCommandLineEditor()

    private val channelLabel: JLabel = Label(RsBundle.message("settings.rust.rustfmt.channel.label"))
    private val channel: ComboBox<RustChannel> = ComboBox<RustChannel>().apply {
        RustChannel.values()
            .sortedBy { it.index }
            .forEach { addItem(it) }
    }

    private val environmentVariables: EnvironmentVariablesComponent = EnvironmentVariablesComponent()

    override fun createPanel(): DialogPanel = panel {
        blockRow {
            row(RsBundle.message("settings.rust.rustfmt.additional.arguments.label")) {
                additionalArguments(pushX, growX)
                    .comment(RsBundle.message("settings.rust.rustfmt.additional.arguments.comment"))
                    .withBinding(
                        componentGet = { it.text },
                        componentSet = { component, value -> component.text = value },
                        modelBinding = settings.state::additionalArguments.toBinding()
                    )

                channelLabel.labelFor = channel
                channelLabel()
                channel().withBinding(
                    componentGet = { it.item },
                    componentSet = { component, value -> component.item = value },
                    modelBinding = settings.state::channel.toBinding()
                )
            }

            row(environmentVariables.label) {
                environmentVariables(growX)
                    .withBinding(
                        componentGet = { it.envs },
                        componentSet = { component, value -> component.envs = value },
                        modelBinding = settings.state::envs.toBinding()
                    )
            }
        }

        row { checkBox(RsBundle.message("settings.rust.rustfmt.builtin.formatter.label"), settings.state::useRustfmt) }
        row { checkBox(RsBundle.message("settings.rust.rustfmt.run.on.save.label"), settings.state::runRustfmtOnSave) }
    }
}
