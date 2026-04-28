val gdxVersion: String by project

val collectChars = tasks.register("collectChars") {
    description = "扫描所有 .kt 源文件，提取非 ASCII 字符写入 build/generated/font/font_chars.txt"
    group = "build"
    val outputDir = rootProject.layout.buildDirectory.dir("generated/font")
    outputs.dir(outputDir)
    doLast {
        val srcDir = file("src/main/kotlin")
        val chars = mutableSetOf<Char>()
        srcDir.walkTopDown().filter { it.extension == "kt" }.forEach { f ->
            f.readText().forEach { c -> if (c > '\u007F') chars.add(c) }
        }
        val output = outputDir.get().file("font_chars.txt").asFile
        output.parentFile.mkdirs()
        output.writeText(chars.sorted().joinToString(""))
        println("collectChars: 共收集 ${chars.size} 个字符 -> ${output.path}")
    }
}

tasks.named("compileKotlin") {
    dependsOn(collectChars)
}
val ktxVersion: String by project
val kotlinVersion: String by project

dependencies {
    api("com.badlogicgames.gdx:gdx:$gdxVersion")
    api("com.badlogicgames.gdx:gdx-freetype:$gdxVersion")
    api("io.github.libktx:ktx-assets:${ktxVersion}")
    api("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
}

tasks.named<Jar>("jar") {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}

tasks.named<Test>("test") {
    failOnNoDiscoveredTests.set(false)
}
