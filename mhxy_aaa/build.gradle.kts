buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${properties["kotlinVersion"]}")
    }
}

tasks.register("collectChars") {
    description = "扫描所有 .kt 源文件，提取非 ASCII 字符写入 build/generated/font/font_chars.txt"
    group = "build"
    val outputDir = layout.buildDirectory.dir("generated/font")
    outputs.dir(outputDir)
    doLast {
        val srcDir = file("core/src/main/kotlin")
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

subprojects {
    version = properties["projectVersion"] as String
    ext["appName"] = "mhxy_m"

    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots/")
        maven("https://jitpack.io")
        maven("https://teavm.org/maven/repository/")
    }
}

configure(subprojects) {
    apply(plugin = "java-library")
    apply(plugin = "kotlin")

    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_21
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }

}
