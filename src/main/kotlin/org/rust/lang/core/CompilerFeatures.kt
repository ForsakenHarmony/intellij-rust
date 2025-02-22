/*
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */

@file:Suppress("unused")

package org.rust.lang.core

import org.rust.lang.core.FeatureState.*

// Accepted features
val ISSUE_5723_BOOTSTRAP = CompilerFeature("issue_5723_bootstrap", ACCEPTED, "1.0.0")
val TEST_ACCEPTED_FEATURE = CompilerFeature("test_accepted_feature", ACCEPTED, "1.0.0")
val AARCH64_TARGET_FEATURE = CompilerFeature("aarch64_target_feature", ACCEPTED, "1.61.0")
val ABI_SYSV64 = CompilerFeature("abi_sysv64", ACCEPTED, "1.24.0")
val ADX_TARGET_FEATURE = CompilerFeature("adx_target_feature", ACCEPTED, "1.61.0")
val ASSOCIATED_CONSTS = CompilerFeature("associated_consts", ACCEPTED, "1.20.0")
val ASSOCIATED_TYPES = CompilerFeature("associated_types", ACCEPTED, "1.0.0")
val ASYNC_AWAIT = CompilerFeature("async_await", ACCEPTED, "1.39.0")
val ATTR_LITERALS = CompilerFeature("attr_literals", ACCEPTED, "1.30.0")
val AUGMENTED_ASSIGNMENTS = CompilerFeature("augmented_assignments", ACCEPTED, "1.8.0")
val BIND_BY_MOVE_PATTERN_GUARDS = CompilerFeature("bind_by_move_pattern_guards", ACCEPTED, "1.39.0")
val BINDINGS_AFTER_AT = CompilerFeature("bindings_after_at", ACCEPTED, "1.56.0")
val BRACED_EMPTY_STRUCTS = CompilerFeature("braced_empty_structs", ACCEPTED, "1.8.0")
val CFG_ATTR_MULTI = CompilerFeature("cfg_attr_multi", ACCEPTED, "1.33.0")
val CFG_DOCTEST = CompilerFeature("cfg_doctest", ACCEPTED, "1.40.0")
val CFG_PANIC = CompilerFeature("cfg_panic", ACCEPTED, "1.60.0")
val CFG_TARGET_FEATURE = CompilerFeature("cfg_target_feature", ACCEPTED, "1.27.0")
val CFG_TARGET_VENDOR = CompilerFeature("cfg_target_vendor", ACCEPTED, "1.33.0")
val CLONE_CLOSURES = CompilerFeature("clone_closures", ACCEPTED, "1.26.0")
val CLOSURE_TO_FN_COERCION = CompilerFeature("closure_to_fn_coercion", ACCEPTED, "1.19.0")
val COMPILE_ERROR = CompilerFeature("compile_error", ACCEPTED, "1.20.0")
val CONSERVATIVE_IMPL_TRAIT = CompilerFeature("conservative_impl_trait", ACCEPTED, "1.26.0")
val CONST_CONSTRUCTOR = CompilerFeature("const_constructor", ACCEPTED, "1.40.0")
val CONST_FN_FN_PTR_BASICS = CompilerFeature("const_fn_fn_ptr_basics", ACCEPTED, "1.61.0")
val CONST_FN_TRAIT_BOUND = CompilerFeature("const_fn_trait_bound", ACCEPTED, "1.61.0")
val CONST_FN_TRANSMUTE = CompilerFeature("const_fn_transmute", ACCEPTED, "1.56.0")
val CONST_FN_UNION = CompilerFeature("const_fn_union", ACCEPTED, "1.56.0")
val CONST_FN_UNSIZE = CompilerFeature("const_fn_unsize", ACCEPTED, "1.54.0")
val CONST_GENERICS_DEFAULTS = CompilerFeature("const_generics_defaults", ACCEPTED, "1.59.0")
val CONST_IF_MATCH = CompilerFeature("const_if_match", ACCEPTED, "1.46.0")
val CONST_IMPL_TRAIT = CompilerFeature("const_impl_trait", ACCEPTED, "1.61.0")
val CONST_INDEXING = CompilerFeature("const_indexing", ACCEPTED, "1.26.0")
val CONST_LET = CompilerFeature("const_let", ACCEPTED, "1.33.0")
val CONST_LOOP = CompilerFeature("const_loop", ACCEPTED, "1.46.0")
val CONST_PANIC = CompilerFeature("const_panic", ACCEPTED, "1.57.0")
val CONST_RAW_PTR_DEREF = CompilerFeature("const_raw_ptr_deref", ACCEPTED, "1.58.0")
val COPY_CLOSURES = CompilerFeature("copy_closures", ACCEPTED, "1.26.0")
val CRATE_IN_PATHS = CompilerFeature("crate_in_paths", ACCEPTED, "1.30.0")
val DEFAULT_TYPE_PARAMS = CompilerFeature("default_type_params", ACCEPTED, "1.0.0")
val DEPRECATED = CompilerFeature("deprecated", ACCEPTED, "1.9.0")
val DERIVE_DEFAULT_ENUM = CompilerFeature("derive_default_enum", ACCEPTED, "1.62.0")
val DESTRUCTURING_ASSIGNMENT = CompilerFeature("destructuring_assignment", ACCEPTED, "1.59.0")
val DOC_ALIAS = CompilerFeature("doc_alias", ACCEPTED, "1.48.0")
val DOTDOT_IN_TUPLE_PATTERNS = CompilerFeature("dotdot_in_tuple_patterns", ACCEPTED, "1.14.0")
val DOTDOTEQ_IN_PATTERNS = CompilerFeature("dotdoteq_in_patterns", ACCEPTED, "1.26.0")
val DROP_TYPES_IN_CONST = CompilerFeature("drop_types_in_const", ACCEPTED, "1.22.0")
val DYN_TRAIT = CompilerFeature("dyn_trait", ACCEPTED, "1.27.0")
val EXHAUSTIVE_INTEGER_PATTERNS = CompilerFeature("exhaustive_integer_patterns", ACCEPTED, "1.33.0")
val EXTENDED_KEY_VALUE_ATTRIBUTES = CompilerFeature("extended_key_value_attributes", ACCEPTED, "1.54.0")
val EXTERN_ABSOLUTE_PATHS = CompilerFeature("extern_absolute_paths", ACCEPTED, "1.30.0")
val EXTERN_CRATE_ITEM_PRELUDE = CompilerFeature("extern_crate_item_prelude", ACCEPTED, "1.31.0")
val EXTERN_CRATE_SELF = CompilerFeature("extern_crate_self", ACCEPTED, "1.34.0")
val EXTERN_PRELUDE = CompilerFeature("extern_prelude", ACCEPTED, "1.30.0")
val FIELD_INIT_SHORTHAND = CompilerFeature("field_init_shorthand", ACCEPTED, "1.17.0")
val FN_MUST_USE = CompilerFeature("fn_must_use", ACCEPTED, "1.27.0")
val FORMAT_ARGS_CAPTURE = CompilerFeature("format_args_capture", ACCEPTED, "1.58.0")
val GENERIC_PARAM_ATTRS = CompilerFeature("generic_param_attrs", ACCEPTED, "1.27.0")
val GLOBAL_ALLOCATOR = CompilerFeature("global_allocator", ACCEPTED, "1.28.0")
val GLOBS = CompilerFeature("globs", ACCEPTED, "1.0.0")
val I128_TYPE = CompilerFeature("i128_type", ACCEPTED, "1.26.0")
val IF_LET = CompilerFeature("if_let", ACCEPTED, "1.0.0")
val IF_WHILE_OR_PATTERNS = CompilerFeature("if_while_or_patterns", ACCEPTED, "1.33.0")
val IMPL_HEADER_LIFETIME_ELISION = CompilerFeature("impl_header_lifetime_elision", ACCEPTED, "1.31.0")
val INCLUSIVE_RANGE_SYNTAX = CompilerFeature("inclusive_range_syntax", ACCEPTED, "1.26.0")
val INFER_OUTLIVES_REQUIREMENTS = CompilerFeature("infer_outlives_requirements", ACCEPTED, "1.30.0")
val IRREFUTABLE_LET_PATTERNS = CompilerFeature("irrefutable_let_patterns", ACCEPTED, "1.33.0")
val ITEM_LIKE_IMPORTS = CompilerFeature("item_like_imports", ACCEPTED, "1.15.0")
val LOOP_BREAK_VALUE = CompilerFeature("loop_break_value", ACCEPTED, "1.19.0")
val MACRO_AT_MOST_ONCE_REP = CompilerFeature("macro_at_most_once_rep", ACCEPTED, "1.32.0")
val MACRO_ATTRIBUTES_IN_DERIVE_OUTPUT = CompilerFeature("macro_attributes_in_derive_output", ACCEPTED, "1.57.0")
val MACRO_LIFETIME_MATCHER = CompilerFeature("macro_lifetime_matcher", ACCEPTED, "1.27.0")
val MACRO_LITERAL_MATCHER = CompilerFeature("macro_literal_matcher", ACCEPTED, "1.32.0")
val MACRO_RULES = CompilerFeature("macro_rules", ACCEPTED, "1.0.0")
val MACRO_VIS_MATCHER = CompilerFeature("macro_vis_matcher", ACCEPTED, "1.30.0")
val MACROS_IN_EXTERN = CompilerFeature("macros_in_extern", ACCEPTED, "1.40.0")
val MATCH_BEGINNING_VERT = CompilerFeature("match_beginning_vert", ACCEPTED, "1.25.0")
val MATCH_DEFAULT_BINDINGS = CompilerFeature("match_default_bindings", ACCEPTED, "1.26.0")
val MEMBER_CONSTRAINTS = CompilerFeature("member_constraints", ACCEPTED, "1.54.0")
val MIN_CONST_FN = CompilerFeature("min_const_fn", ACCEPTED, "1.31.0")
val MIN_CONST_GENERICS = CompilerFeature("min_const_generics", ACCEPTED, "1.51.0")
val MIN_CONST_UNSAFE_FN = CompilerFeature("min_const_unsafe_fn", ACCEPTED, "1.33.0")
val MORE_STRUCT_ALIASES = CompilerFeature("more_struct_aliases", ACCEPTED, "1.16.0")
val MOVE_REF_PATTERN = CompilerFeature("move_ref_pattern", ACCEPTED, "1.49.0")
val NATIVE_LINK_MODIFIERS = CompilerFeature("native_link_modifiers", ACCEPTED, "1.61.0")
val NATIVE_LINK_MODIFIERS_WHOLE_ARCHIVE = CompilerFeature("native_link_modifiers_whole_archive", ACCEPTED, "1.61.0")
val NO_STD = CompilerFeature("no_std", ACCEPTED, "1.6.0")
val NON_ASCII_IDENTS = CompilerFeature("non_ascii_idents", ACCEPTED, "1.53.0")
val NON_EXHAUSTIVE = CompilerFeature("non_exhaustive", ACCEPTED, "1.40.0")
val NON_MODRS_MODS = CompilerFeature("non_modrs_mods", ACCEPTED, "1.30.0")
val OR_PATTERNS = CompilerFeature("or_patterns", ACCEPTED, "1.53.0")
val PANIC_HANDLER = CompilerFeature("panic_handler", ACCEPTED, "1.30.0")
val PARAM_ATTRS = CompilerFeature("param_attrs", ACCEPTED, "1.39.0")
val PATTERN_PARENTHESES = CompilerFeature("pattern_parentheses", ACCEPTED, "1.31.0")
val PROC_MACRO = CompilerFeature("proc_macro", ACCEPTED, "1.29.0")
val PROC_MACRO_PATH_INVOC = CompilerFeature("proc_macro_path_invoc", ACCEPTED, "1.30.0")
val PUB_RESTRICTED = CompilerFeature("pub_restricted", ACCEPTED, "1.18.0")
val QUESTION_MARK = CompilerFeature("question_mark", ACCEPTED, "1.13.0")
val RAW_IDENTIFIERS = CompilerFeature("raw_identifiers", ACCEPTED, "1.30.0")
val RE_REBALANCE_COHERENCE = CompilerFeature("re_rebalance_coherence", ACCEPTED, "1.41.0")
val RELAXED_ADTS = CompilerFeature("relaxed_adts", ACCEPTED, "1.19.0")
val RELAXED_STRUCT_UNSIZE = CompilerFeature("relaxed_struct_unsize", ACCEPTED, "1.58.0")
val REPR_ALIGN = CompilerFeature("repr_align", ACCEPTED, "1.25.0")
val REPR_ALIGN_ENUM = CompilerFeature("repr_align_enum", ACCEPTED, "1.37.0")
val REPR_PACKED = CompilerFeature("repr_packed", ACCEPTED, "1.33.0")
val REPR_TRANSPARENT = CompilerFeature("repr_transparent", ACCEPTED, "1.28.0")
val RVALUE_STATIC_PROMOTION = CompilerFeature("rvalue_static_promotion", ACCEPTED, "1.21.0")
val SELF_IN_TYPEDEFS = CompilerFeature("self_in_typedefs", ACCEPTED, "1.32.0")
val SELF_STRUCT_CTOR = CompilerFeature("self_struct_ctor", ACCEPTED, "1.32.0")
val SLICE_PATTERNS = CompilerFeature("slice_patterns", ACCEPTED, "1.42.0")
val SLICING_SYNTAX = CompilerFeature("slicing_syntax", ACCEPTED, "1.0.0")
val STATIC_IN_CONST = CompilerFeature("static_in_const", ACCEPTED, "1.17.0")
val STATIC_RECURSION = CompilerFeature("static_recursion", ACCEPTED, "1.17.0")
val STRUCT_FIELD_ATTRIBUTES = CompilerFeature("struct_field_attributes", ACCEPTED, "1.20.0")
val STRUCT_VARIANT = CompilerFeature("struct_variant", ACCEPTED, "1.0.0")
val TARGET_FEATURE = CompilerFeature("target_feature", ACCEPTED, "1.27.0")
val TERMINATION_TRAIT = CompilerFeature("termination_trait", ACCEPTED, "1.26.0")
val TERMINATION_TRAIT_TEST = CompilerFeature("termination_trait_test", ACCEPTED, "1.27.0")
val TOOL_ATTRIBUTES = CompilerFeature("tool_attributes", ACCEPTED, "1.30.0")
val TOOL_LINTS = CompilerFeature("tool_lints", ACCEPTED, "1.31.0")
val TRACK_CALLER = CompilerFeature("track_caller", ACCEPTED, "1.46.0")
val TRANSPARENT_ENUMS = CompilerFeature("transparent_enums", ACCEPTED, "1.42.0")
val TUPLE_INDEXING = CompilerFeature("tuple_indexing", ACCEPTED, "1.0.0")
val TYPE_ALIAS_ENUM_VARIANTS = CompilerFeature("type_alias_enum_variants", ACCEPTED, "1.37.0")
val TYPE_MACROS = CompilerFeature("type_macros", ACCEPTED, "1.13.0")
val UNDERSCORE_CONST_NAMES = CompilerFeature("underscore_const_names", ACCEPTED, "1.37.0")
val UNDERSCORE_IMPORTS = CompilerFeature("underscore_imports", ACCEPTED, "1.33.0")
val UNDERSCORE_LIFETIMES = CompilerFeature("underscore_lifetimes", ACCEPTED, "1.26.0")
val UNIFORM_PATHS = CompilerFeature("uniform_paths", ACCEPTED, "1.32.0")
val UNIVERSAL_IMPL_TRAIT = CompilerFeature("universal_impl_trait", ACCEPTED, "1.26.0")
val UNRESTRICTED_ATTRIBUTE_TOKENS = CompilerFeature("unrestricted_attribute_tokens", ACCEPTED, "1.34.0")
val UNSAFE_BLOCK_IN_UNSAFE_FN = CompilerFeature("unsafe_block_in_unsafe_fn", ACCEPTED, "1.52.0")
val USE_EXTERN_MACROS = CompilerFeature("use_extern_macros", ACCEPTED, "1.30.0")
val USE_NESTED_GROUPS = CompilerFeature("use_nested_groups", ACCEPTED, "1.25.0")
val USED = CompilerFeature("used", ACCEPTED, "1.30.0")
val WHILE_LET = CompilerFeature("while_let", ACCEPTED, "1.0.0")
val WINDOWS_SUBSYSTEM = CompilerFeature("windows_subsystem", ACCEPTED, "1.18.0")

// Active features
val ABI_THISCALL = CompilerFeature("abi_thiscall", ACTIVE, "1.19.0")
val ABI_UNADJUSTED = CompilerFeature("abi_unadjusted", ACTIVE, "1.16.0")
val ABI_VECTORCALL = CompilerFeature("abi_vectorcall", ACTIVE, "1.7.0")
val ALLOCATOR_INTERNALS = CompilerFeature("allocator_internals", ACTIVE, "1.20.0")
val ALLOW_INTERNAL_UNSAFE = CompilerFeature("allow_internal_unsafe", ACTIVE, "1.0.0")
val ALLOW_INTERNAL_UNSTABLE = CompilerFeature("allow_internal_unstable", ACTIVE, "1.0.0")
val COMPILER_BUILTINS = CompilerFeature("compiler_builtins", ACTIVE, "1.13.0")
val INTRINSICS = CompilerFeature("intrinsics", ACTIVE, "1.0.0")
val LANG_ITEMS = CompilerFeature("lang_items", ACTIVE, "1.0.0")
val NO_NICHE = CompilerFeature("no_niche", ACTIVE, "1.42.0")
val OMIT_GDB_PRETTY_PRINTER_SECTION = CompilerFeature("omit_gdb_pretty_printer_section", ACTIVE, "1.5.0")
val PRELUDE_IMPORT = CompilerFeature("prelude_import", ACTIVE, "1.2.0")
val PROFILER_RUNTIME = CompilerFeature("profiler_runtime", ACTIVE, "1.18.0")
val RUSTC_ATTRS = CompilerFeature("rustc_attrs", ACTIVE, "1.0.0")
val STAGED_API = CompilerFeature("staged_api", ACTIVE, "1.0.0")
val TEST_2018_FEATURE = CompilerFeature("test_2018_feature", ACTIVE, "1.31.0")
val TEST_UNSTABLE_LINT = CompilerFeature("test_unstable_lint", ACTIVE, "1.60.0")
val UNSAFE_PIN_INTERNALS = CompilerFeature("unsafe_pin_internals", INCOMPLETE, "1.60.0")
val WITH_NEGATIVE_COHERENCE = CompilerFeature("with_negative_coherence", ACTIVE, "1.60.0")
val AUTO_TRAITS = CompilerFeature("auto_traits", ACTIVE, "1.50.0")
val BOX_PATTERNS = CompilerFeature("box_patterns", ACTIVE, "1.0.0")
val BOX_SYNTAX = CompilerFeature("box_syntax", ACTIVE, "1.0.0")
val DOC_NOTABLE_TRAIT = CompilerFeature("doc_notable_trait", ACTIVE, "1.52.0")
val DROPCK_EYEPATCH = CompilerFeature("dropck_eyepatch", ACTIVE, "1.10.0")
val FUNDAMENTAL = CompilerFeature("fundamental", ACTIVE, "1.0.0")
val LINK_LLVM_INTRINSICS = CompilerFeature("link_llvm_intrinsics", ACTIVE, "1.0.0")
val LINKAGE = CompilerFeature("linkage", ACTIVE, "1.0.0")
val NEEDS_PANIC_RUNTIME = CompilerFeature("needs_panic_runtime", ACTIVE, "1.10.0")
val PANIC_RUNTIME = CompilerFeature("panic_runtime", ACTIVE, "1.10.0")
val RUSTC_ALLOW_CONST_FN_UNSTABLE = CompilerFeature("rustc_allow_const_fn_unstable", ACTIVE, "1.49.0")
val RUSTC_PRIVATE = CompilerFeature("rustc_private", ACTIVE, "1.0.0")
val RUSTDOC_INTERNALS = CompilerFeature("rustdoc_internals", ACTIVE, "1.58.0")
val START = CompilerFeature("start", ACTIVE, "1.0.0")
val STRUCTURAL_MATCH = CompilerFeature("structural_match", ACTIVE, "1.8.0")
val UNBOXED_CLOSURES = CompilerFeature("unboxed_closures", ACTIVE, "1.0.0")
val AARCH64_VER_TARGET_FEATURE = CompilerFeature("aarch64_ver_target_feature", ACTIVE, "1.27.0")
val ARM_TARGET_FEATURE = CompilerFeature("arm_target_feature", ACTIVE, "1.27.0")
val AVX512_TARGET_FEATURE = CompilerFeature("avx512_target_feature", ACTIVE, "1.27.0")
val BPF_TARGET_FEATURE = CompilerFeature("bpf_target_feature", ACTIVE, "1.54.0")
val CMPXCHG16B_TARGET_FEATURE = CompilerFeature("cmpxchg16b_target_feature", ACTIVE, "1.32.0")
val ERMSB_TARGET_FEATURE = CompilerFeature("ermsb_target_feature", ACTIVE, "1.49.0")
val F16C_TARGET_FEATURE = CompilerFeature("f16c_target_feature", ACTIVE, "1.36.0")
val HEXAGON_TARGET_FEATURE = CompilerFeature("hexagon_target_feature", ACTIVE, "1.27.0")
val MIPS_TARGET_FEATURE = CompilerFeature("mips_target_feature", ACTIVE, "1.27.0")
val MOVBE_TARGET_FEATURE = CompilerFeature("movbe_target_feature", ACTIVE, "1.34.0")
val POWERPC_TARGET_FEATURE = CompilerFeature("powerpc_target_feature", ACTIVE, "1.27.0")
val RISCV_TARGET_FEATURE = CompilerFeature("riscv_target_feature", ACTIVE, "1.45.0")
val RTM_TARGET_FEATURE = CompilerFeature("rtm_target_feature", ACTIVE, "1.35.0")
val SSE4A_TARGET_FEATURE = CompilerFeature("sse4a_target_feature", ACTIVE, "1.27.0")
val TBM_TARGET_FEATURE = CompilerFeature("tbm_target_feature", ACTIVE, "1.27.0")
val WASM_TARGET_FEATURE = CompilerFeature("wasm_target_feature", ACTIVE, "1.30.0")
val ABI_AMDGPU_KERNEL = CompilerFeature("abi_amdgpu_kernel", ACTIVE, "1.29.0")
val ABI_AVR_INTERRUPT = CompilerFeature("abi_avr_interrupt", ACTIVE, "1.45.0")
val ABI_C_CMSE_NONSECURE_CALL = CompilerFeature("abi_c_cmse_nonsecure_call", ACTIVE, "1.51.0")
val ABI_EFIAPI = CompilerFeature("abi_efiapi", ACTIVE, "1.40.0")
val ABI_MSP430_INTERRUPT = CompilerFeature("abi_msp430_interrupt", ACTIVE, "1.16.0")
val ABI_PTX = CompilerFeature("abi_ptx", ACTIVE, "1.15.0")
val ABI_X86_INTERRUPT = CompilerFeature("abi_x86_interrupt", ACTIVE, "1.17.0")
val ADT_CONST_PARAMS = CompilerFeature("adt_const_params", INCOMPLETE, "1.56.0")
val ALLOC_ERROR_HANDLER = CompilerFeature("alloc_error_handler", ACTIVE, "1.29.0")
val ARBITRARY_ENUM_DISCRIMINANT = CompilerFeature("arbitrary_enum_discriminant", ACTIVE, "1.37.0")
val ARBITRARY_SELF_TYPES = CompilerFeature("arbitrary_self_types", ACTIVE, "1.23.0")
val ASM_CONST = CompilerFeature("asm_const", ACTIVE, "1.58.0")
val ASM_EXPERIMENTAL_ARCH = CompilerFeature("asm_experimental_arch", ACTIVE, "1.58.0")
val ASM_SYM = CompilerFeature("asm_sym", ACTIVE, "1.58.0")
val ASM_UNWIND = CompilerFeature("asm_unwind", ACTIVE, "1.58.0")
val ASSOCIATED_CONST_EQUALITY = CompilerFeature("associated_const_equality", ACTIVE, "1.58.0")
val ASSOCIATED_TYPE_BOUNDS = CompilerFeature("associated_type_bounds", ACTIVE, "1.34.0")
val ASSOCIATED_TYPE_DEFAULTS = CompilerFeature("associated_type_defaults", ACTIVE, "1.2.0")
val ASYNC_CLOSURE = CompilerFeature("async_closure", ACTIVE, "1.37.0")
val C_UNWIND = CompilerFeature("c_unwind", ACTIVE, "1.52.0")
val C_VARIADIC = CompilerFeature("c_variadic", ACTIVE, "1.34.0")
val CAPTURE_DISJOINT_FIELDS = CompilerFeature("capture_disjoint_fields", INCOMPLETE, "1.49.0")
val CFG_SANITIZE = CompilerFeature("cfg_sanitize", ACTIVE, "1.41.0")
val CFG_TARGET_ABI = CompilerFeature("cfg_target_abi", ACTIVE, "1.55.0")
val CFG_TARGET_HAS_ATOMIC = CompilerFeature("cfg_target_has_atomic", ACTIVE, "1.60.0")
val CFG_TARGET_HAS_ATOMIC_EQUAL_ALIGNMENT = CompilerFeature("cfg_target_has_atomic_equal_alignment", ACTIVE, "1.60.0")
val CFG_TARGET_THREAD_LOCAL = CompilerFeature("cfg_target_thread_local", ACTIVE, "1.7.0")
val CFG_VERSION = CompilerFeature("cfg_version", ACTIVE, "1.45.0")
val CLOSURE_TRACK_CALLER = CompilerFeature("closure_track_caller", ACTIVE, "1.57.0")
val CMSE_NONSECURE_ENTRY = CompilerFeature("cmse_nonsecure_entry", ACTIVE, "1.48.0")
val CONST_ASYNC_BLOCKS = CompilerFeature("const_async_blocks", ACTIVE, "1.53.0")
val CONST_EVAL_LIMIT = CompilerFeature("const_eval_limit", ACTIVE, "1.43.0")
val CONST_EXTERN_FN = CompilerFeature("const_extern_fn", ACTIVE, "1.40.0")
val CONST_FN_FLOATING_POINT_ARITHMETIC = CompilerFeature("const_fn_floating_point_arithmetic", ACTIVE, "1.48.0")
val CONST_FOR = CompilerFeature("const_for", ACTIVE, "1.56.0")
val CONST_MUT_REFS = CompilerFeature("const_mut_refs", ACTIVE, "1.41.0")
val CONST_PRECISE_LIVE_DROPS = CompilerFeature("const_precise_live_drops", ACTIVE, "1.46.0")
val CONST_REFS_TO_CELL = CompilerFeature("const_refs_to_cell", ACTIVE, "1.51.0")
val CONST_TRAIT_IMPL = CompilerFeature("const_trait_impl", ACTIVE, "1.42.0")
val CONST_TRY = CompilerFeature("const_try", ACTIVE, "1.56.0")
val CRATE_VISIBILITY_MODIFIER = CompilerFeature("crate_visibility_modifier", ACTIVE, "1.23.0")
val CUSTOM_INNER_ATTRIBUTES = CompilerFeature("custom_inner_attributes", ACTIVE, "1.30.0")
val CUSTOM_TEST_FRAMEWORKS = CompilerFeature("custom_test_frameworks", ACTIVE, "1.30.0")
val DEBUGGER_VISUALIZER = CompilerFeature("debugger_visualizer", ACTIVE, "1.62.0")
val DECL_MACRO = CompilerFeature("decl_macro", ACTIVE, "1.17.0")
val DEFAULT_ALLOC_ERROR_HANDLER = CompilerFeature("default_alloc_error_handler", ACTIVE, "1.48.0")
val DEFAULT_TYPE_PARAMETER_FALLBACK = CompilerFeature("default_type_parameter_fallback", ACTIVE, "1.3.0")
val DEPRECATED_SAFE = CompilerFeature("deprecated_safe", ACTIVE, "1.61.0")
val DEPRECATED_SUGGESTION = CompilerFeature("deprecated_suggestion", ACTIVE, "1.61.0")
val DOC_AUTO_CFG = CompilerFeature("doc_auto_cfg", ACTIVE, "1.58.0")
val DOC_CFG = CompilerFeature("doc_cfg", ACTIVE, "1.21.0")
val DOC_CFG_HIDE = CompilerFeature("doc_cfg_hide", ACTIVE, "1.57.0")
val DOC_MASKED = CompilerFeature("doc_masked", ACTIVE, "1.21.0")
val EXCLUSIVE_RANGE_PATTERN = CompilerFeature("exclusive_range_pattern", ACTIVE, "1.11.0")
val EXHAUSTIVE_PATTERNS = CompilerFeature("exhaustive_patterns", ACTIVE, "1.13.0")
val EXPLICIT_GENERIC_ARGS_WITH_IMPL_TRAIT = CompilerFeature("explicit_generic_args_with_impl_trait", ACTIVE, "1.56.0")
val EXTERN_TYPES = CompilerFeature("extern_types", ACTIVE, "1.23.0")
val FFI_CONST = CompilerFeature("ffi_const", ACTIVE, "1.45.0")
val FFI_PURE = CompilerFeature("ffi_pure", ACTIVE, "1.45.0")
val FFI_RETURNS_TWICE = CompilerFeature("ffi_returns_twice", ACTIVE, "1.34.0")
val FN_ALIGN = CompilerFeature("fn_align", ACTIVE, "1.53.0")
val GENERATORS = CompilerFeature("generators", ACTIVE, "1.21.0")
val GENERIC_ARG_INFER = CompilerFeature("generic_arg_infer", ACTIVE, "1.55.0")
val GENERIC_ASSOCIATED_TYPES = CompilerFeature("generic_associated_types", ACTIVE, "1.23.0")
val GENERIC_ASSOCIATED_TYPES_EXTENDED = CompilerFeature("generic_associated_types_extended", INCOMPLETE, "1.61.0")
val GENERIC_CONST_EXPRS = CompilerFeature("generic_const_exprs", INCOMPLETE, "1.56.0")
val HALF_OPEN_RANGE_PATTERNS = CompilerFeature("half_open_range_patterns", ACTIVE, "1.41.0")
val IF_LET_GUARD = CompilerFeature("if_let_guard", ACTIVE, "1.47.0")
val IMPORTED_MAIN = CompilerFeature("imported_main", ACTIVE, "1.53.0")
val INFER_STATIC_OUTLIVES_REQUIREMENTS = CompilerFeature("infer_static_outlives_requirements", ACTIVE, "1.26.0")
val INHERENT_ASSOCIATED_TYPES = CompilerFeature("inherent_associated_types", INCOMPLETE, "1.52.0")
val INLINE_CONST = CompilerFeature("inline_const", ACTIVE, "1.49.0")
val INLINE_CONST_PAT = CompilerFeature("inline_const_pat", INCOMPLETE, "1.58.0")
val INTRA_DOC_POINTERS = CompilerFeature("intra_doc_pointers", ACTIVE, "1.51.0")
val ISA_ATTRIBUTE = CompilerFeature("isa_attribute", ACTIVE, "1.48.0")
val LABEL_BREAK_VALUE = CompilerFeature("label_break_value", ACTIVE, "1.28.0")
val LARGE_ASSIGNMENTS = CompilerFeature("large_assignments", ACTIVE, "1.52.0")
val LET_CHAINS = CompilerFeature("let_chains", ACTIVE, "1.37.0")
val LET_ELSE = CompilerFeature("let_else", ACTIVE, "1.56.0")
val LINK_CFG = CompilerFeature("link_cfg", ACTIVE, "1.14.0")
val LINT_REASONS = CompilerFeature("lint_reasons", ACTIVE, "1.31.0")
val MACRO_METAVAR_EXPR = CompilerFeature("macro_metavar_expr", ACTIVE, "1.61.0")
val MARKER_TRAIT_ATTR = CompilerFeature("marker_trait_attr", ACTIVE, "1.30.0")
val MIN_SPECIALIZATION = CompilerFeature("min_specialization", ACTIVE, "1.7.0")
val MORE_QUALIFIED_PATHS = CompilerFeature("more_qualified_paths", ACTIVE, "1.54.0")
val MUST_NOT_SUSPEND = CompilerFeature("must_not_suspend", ACTIVE, "1.57.0")
val NAKED_FUNCTIONS = CompilerFeature("naked_functions", ACTIVE, "1.9.0")
val NATIVE_LINK_MODIFIERS_AS_NEEDED = CompilerFeature("native_link_modifiers_as_needed", ACTIVE, "1.53.0")
val NATIVE_LINK_MODIFIERS_BUNDLE = CompilerFeature("native_link_modifiers_bundle", ACTIVE, "1.53.0")
val NATIVE_LINK_MODIFIERS_VERBATIM = CompilerFeature("native_link_modifiers_verbatim", ACTIVE, "1.53.0")
val NEGATIVE_IMPLS = CompilerFeature("negative_impls", ACTIVE, "1.44.0")
val NEVER_TYPE = CompilerFeature("never_type", ACTIVE, "1.13.0")
val NEVER_TYPE_FALLBACK = CompilerFeature("never_type_fallback", ACTIVE, "1.41.0")
val NLL = CompilerFeature("nll", ACTIVE, "1.0.0")
val NO_CORE = CompilerFeature("no_core", ACTIVE, "1.3.0")
val NO_COVERAGE = CompilerFeature("no_coverage", ACTIVE, "1.53.0")
val NO_SANITIZE = CompilerFeature("no_sanitize", ACTIVE, "1.42.0")
val NON_EXHAUSTIVE_OMITTED_PATTERNS_LINT = CompilerFeature("non_exhaustive_omitted_patterns_lint", ACTIVE, "1.57.0")
val OBJECT_SAFE_FOR_DISPATCH = CompilerFeature("object_safe_for_dispatch", ACTIVE, "1.40.0")
val OPTIMIZE_ATTRIBUTE = CompilerFeature("optimize_attribute", ACTIVE, "1.34.0")
val PLATFORM_INTRINSICS = CompilerFeature("platform_intrinsics", ACTIVE, "1.4.0")
val PLUGIN = CompilerFeature("plugin", ACTIVE, "1.0.0")
val PRECISE_POINTER_SIZE_MATCHING = CompilerFeature("precise_pointer_size_matching", ACTIVE, "1.32.0")
val PROC_MACRO_HYGIENE = CompilerFeature("proc_macro_hygiene", ACTIVE, "1.30.0")
val RAW_DYLIB = CompilerFeature("raw_dylib", INCOMPLETE, "1.40.0")
val RAW_REF_OP = CompilerFeature("raw_ref_op", ACTIVE, "1.41.0")
val REGISTER_ATTR = CompilerFeature("register_attr", ACTIVE, "1.41.0")
val REGISTER_TOOL = CompilerFeature("register_tool", ACTIVE, "1.41.0")
val REPR128 = CompilerFeature("repr128", INCOMPLETE, "1.16.0")
val REPR_SIMD = CompilerFeature("repr_simd", ACTIVE, "1.4.0")
val SIMD_FFI = CompilerFeature("simd_ffi", ACTIVE, "1.0.0")
val SPECIALIZATION = CompilerFeature("specialization", INCOMPLETE, "1.7.0")
val STATIC_NOBUNDLE = CompilerFeature("static_nobundle", ACTIVE, "1.16.0")
val STMT_EXPR_ATTRIBUTES = CompilerFeature("stmt_expr_attributes", ACTIVE, "1.6.0")
val STRICT_PROVENANCE = CompilerFeature("strict_provenance", ACTIVE, "1.61.0")
val TARGET_FEATURE_11 = CompilerFeature("target_feature_11", ACTIVE, "1.45.0")
val THREAD_LOCAL = CompilerFeature("thread_local", ACTIVE, "1.0.0")
val TRAIT_ALIAS = CompilerFeature("trait_alias", ACTIVE, "1.24.0")
val TRAIT_UPCASTING = CompilerFeature("trait_upcasting", INCOMPLETE, "1.56.0")
val TRANSPARENT_UNIONS = CompilerFeature("transparent_unions", ACTIVE, "1.37.0")
val TRIVIAL_BOUNDS = CompilerFeature("trivial_bounds", ACTIVE, "1.28.0")
val TRY_BLOCKS = CompilerFeature("try_blocks", ACTIVE, "1.29.0")
val TYPE_ALIAS_IMPL_TRAIT = CompilerFeature("type_alias_impl_trait", ACTIVE, "1.38.0")
val TYPE_ASCRIPTION = CompilerFeature("type_ascription", ACTIVE, "1.6.0")
val TYPE_CHANGING_STRUCT_UPDATE = CompilerFeature("type_changing_struct_update", INCOMPLETE, "1.58.0")
val UNSIZED_FN_PARAMS = CompilerFeature("unsized_fn_params", ACTIVE, "1.49.0")
val UNSIZED_LOCALS = CompilerFeature("unsized_locals", INCOMPLETE, "1.30.0")
val UNSIZED_TUPLE_COERCION = CompilerFeature("unsized_tuple_coercion", ACTIVE, "1.20.0")
val UNTAGGED_UNIONS = CompilerFeature("untagged_unions", ACTIVE, "1.13.0")
val USED_WITH_ARG = CompilerFeature("used_with_arg", ACTIVE, "1.60.0")
val WASM_ABI = CompilerFeature("wasm_abi", ACTIVE, "1.53.0")
val YEET_EXPR = CompilerFeature("yeet_expr", ACTIVE, "1.62.0")

// Removed features
val ADVANCED_SLICE_PATTERNS = CompilerFeature("advanced_slice_patterns", REMOVED, "1.0.0")
val ALLOCATOR = CompilerFeature("allocator", REMOVED, "1.0.0")
val ALLOW_FAIL = CompilerFeature("allow_fail", REMOVED, "1.19.0")
val AWAIT_MACRO = CompilerFeature("await_macro", REMOVED, "1.38.0")
val CONST_COMPARE_RAW_POINTERS = CompilerFeature("const_compare_raw_pointers", REMOVED, "1.46.0")
val CONST_EVALUATABLE_CHECKED = CompilerFeature("const_evaluatable_checked", REMOVED, "1.48.0")
val CONST_FN = CompilerFeature("const_fn", REMOVED, "1.54.0")
val CONST_GENERICS = CompilerFeature("const_generics", REMOVED, "1.34.0")
val CONST_IN_ARRAY_REPEAT_EXPRESSIONS = CompilerFeature("const_in_array_repeat_expressions", REMOVED, "1.37.0")
val CONST_RAW_PTR_TO_USIZE_CAST = CompilerFeature("const_raw_ptr_to_usize_cast", REMOVED, "1.55.0")
val CONST_TRAIT_BOUND_OPT_OUT = CompilerFeature("const_trait_bound_opt_out", REMOVED, "1.42.0")
val CUSTOM_ATTRIBUTE = CompilerFeature("custom_attribute", REMOVED, "1.0.0")
val CUSTOM_DERIVE = CompilerFeature("custom_derive", REMOVED, "1.32.0")
val DOC_KEYWORD = CompilerFeature("doc_keyword", REMOVED, "1.28.0")
val DOC_PRIMITIVE = CompilerFeature("doc_primitive", REMOVED, "1.56.0")
val DOC_SPOTLIGHT = CompilerFeature("doc_spotlight", REMOVED, "1.22.0")
val DROPCK_PARAMETRICITY = CompilerFeature("dropck_parametricity", REMOVED, "1.38.0")
val EXISTENTIAL_TYPE = CompilerFeature("existential_type", REMOVED, "1.38.0")
val EXTERN_IN_PATHS = CompilerFeature("extern_in_paths", REMOVED, "1.33.0")
val EXTERNAL_DOC = CompilerFeature("external_doc", REMOVED, "1.54.0")
val IMPL_TRAIT_IN_BINDINGS = CompilerFeature("impl_trait_in_bindings", REMOVED, "1.55.0")
val IMPORT_SHADOWING = CompilerFeature("import_shadowing", REMOVED, "1.0.0")
val IN_BAND_LIFETIMES = CompilerFeature("in_band_lifetimes", REMOVED, "1.23.0")
val LAZY_NORMALIZATION_CONSTS = CompilerFeature("lazy_normalization_consts", REMOVED, "1.46.0")
val LINK_ARGS = CompilerFeature("link_args", REMOVED, "1.53.0")
val MACRO_REEXPORT = CompilerFeature("macro_reexport", REMOVED, "1.0.0")
val MAIN = CompilerFeature("main", REMOVED, "1.53.0")
val MANAGED_BOXES = CompilerFeature("managed_boxes", REMOVED, "1.0.0")
val MIN_TYPE_ALIAS_IMPL_TRAIT = CompilerFeature("min_type_alias_impl_trait", REMOVED, "1.56.0")
val NEEDS_ALLOCATOR = CompilerFeature("needs_allocator", REMOVED, "1.4.0")
val NEGATE_UNSIGNED = CompilerFeature("negate_unsigned", REMOVED, "1.0.0")
val NO_DEBUG = CompilerFeature("no_debug", REMOVED, "1.43.0")
val ON_UNIMPLEMENTED = CompilerFeature("on_unimplemented", REMOVED, "1.40.0")
val OPT_OUT_COPY = CompilerFeature("opt_out_copy", REMOVED, "1.0.0")
val OPTIN_BUILTIN_TRAITS = CompilerFeature("optin_builtin_traits", REMOVED, "1.0.0")
val OVERLAPPING_MARKER_TRAITS = CompilerFeature("overlapping_marker_traits", REMOVED, "1.42.0")
val PANIC_IMPLEMENTATION = CompilerFeature("panic_implementation", REMOVED, "1.28.0")
val PLUGIN_REGISTRAR = CompilerFeature("plugin_registrar", REMOVED, "1.54.0")
val PROC_MACRO_EXPR = CompilerFeature("proc_macro_expr", REMOVED, "1.27.0")
val PROC_MACRO_GEN = CompilerFeature("proc_macro_gen", REMOVED, "1.27.0")
val PROC_MACRO_MOD = CompilerFeature("proc_macro_mod", REMOVED, "1.27.0")
val PROC_MACRO_NON_ITEMS = CompilerFeature("proc_macro_non_items", REMOVED, "1.27.0")
val PUB_MACRO_RULES = CompilerFeature("pub_macro_rules", REMOVED, "1.53.0")
val PUSHPOP_UNSAFE = CompilerFeature("pushpop_unsafe", REMOVED, "1.2.0")
val QUAD_PRECISION_FLOAT = CompilerFeature("quad_precision_float", REMOVED, "1.0.0")
val QUOTE = CompilerFeature("quote", REMOVED, "1.33.0")
val REFLECT = CompilerFeature("reflect", REMOVED, "1.0.0")
val RUSTC_DIAGNOSTIC_MACROS = CompilerFeature("rustc_diagnostic_macros", REMOVED, "1.38.0")
val SANITIZER_RUNTIME = CompilerFeature("sanitizer_runtime", REMOVED, "1.17.0")
val SIMD = CompilerFeature("simd", REMOVED, "1.0.0")
val STRUCT_INHERIT = CompilerFeature("struct_inherit", REMOVED, "1.0.0")
val TEST_REMOVED_FEATURE = CompilerFeature("test_removed_feature", REMOVED, "1.0.0")
val UNMARKED_API = CompilerFeature("unmarked_api", REMOVED, "1.0.0")
val UNSAFE_NO_DROP_FLAG = CompilerFeature("unsafe_no_drop_flag", REMOVED, "1.0.0")
val UNWIND_ATTRIBUTES = CompilerFeature("unwind_attributes", REMOVED, "1.56.0")
val VISIBLE_PRIVATE_TYPES = CompilerFeature("visible_private_types", REMOVED, "1.0.0")

// Stable removed features
val NO_STACK_CHECK = CompilerFeature("no_stack_check", STABILIZED, "1.0.0")
