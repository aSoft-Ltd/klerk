pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "kommander", "kollections", "kevlar", "kase", "lexi", "kotlinx-interoperable", "koncurrent"
).forEach { includeBuild("../$it") }

rootProject.name = "klerk"

includeSubs("klerk", ".", "api","cloudflare")
