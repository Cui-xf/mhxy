import io.github.fourlastor.construo.Target

plugins {
    application
    id("org.jetbrains.kotlin.jvm")
    id("io.github.fourlastor.construo") version "2.1.0"
}

val gdxVersion: String by project
val lwjgl3Version: String by project
val projectVersion: String by project
val appName: String by project

sourceSets.main {
    resources.srcDir(rootProject.file("assets").path)
}

tasks.named<ProcessResources>("processResources") {
    from(project(":core").tasks.named("collectChars"))
}

application {
    mainClass.set("com.cc.lwjgl3.Lwjgl3Launcher")
    applicationName = appName
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

kotlin {
    compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-desktop")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
    implementation(project(":core"))

    constraints {
        implementation("org.lwjgl:lwjgl:$lwjgl3Version")
        implementation("org.lwjgl:lwjgl-glfw:$lwjgl3Version")
        implementation("org.lwjgl:lwjgl-jemalloc:$lwjgl3Version")
        implementation("org.lwjgl:lwjgl-openal:$lwjgl3Version")
        implementation("org.lwjgl:lwjgl-opengl:$lwjgl3Version")
        implementation("org.lwjgl:lwjgl-stb:$lwjgl3Version")
    }
}

tasks.named<JavaExec>("run") {
    dependsOn(project(":core").tasks.named("collectChars"))
    workingDir = rootProject.file("assets")
    jvmArgs("--enable-native-access=ALL-UNNAMED")
    val os = System.getProperty("os.name").lowercase()
    if (os.contains("mac")) jvmArgs("-XstartOnFirstThread")
}

tasks.named<Jar>("jar") {
    archiveFileName.set("$appName-$projectVersion.jar")
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    dependsOn(configurations.runtimeClasspath)
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    exclude("META-INF/INDEX.LIST", "META-INF/*.SF", "META-INF/*.DSA", "META-INF/*.RSA")
    manifest {
        attributes(
            "Main-Class" to application.mainClass.get(),
            "Enable-Native-Access" to "ALL-UNNAMED",
            "Multi-Release" to "true"
        )
    }
    doLast {
        archiveFile.get().asFile.setExecutable(true, false)
    }
}

tasks.register("dist") {
    dependsOn("jar")
}
construo {
    name.set(appName)
    humanName.set(appName)
    jlink {
        guessModulesFromJar.set(false)
        modules.addAll("java.base", "java.management", "java.desktop", "java.net.http", "jdk.unsupported")
    }
    targets.create("linuxX64", Target.Linux::class.java) {
        architecture.set(Target.Architecture.X86_64)
        jdkUrl.set("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.10%2B7/OpenJDK21U-jdk_x64_linux_hotspot_21.0.10_7.tar.gz")
    }
    targets.create("macM1", Target.MacOs::class.java) {
        architecture.set(Target.Architecture.AARCH64)
        jdkUrl.set("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.10%2B7/OpenJDK21U-jdk_aarch64_mac_hotspot_21.0.10_7.tar.gz")
        identifier.set("com.cc.$appName")
    }
    targets.create("winX64", Target.Windows::class.java) {
        architecture.set(Target.Architecture.X86_64)
        jdkUrl.set("https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.10%2B7/OpenJDK21U-jdk_x64_windows_hotspot_21.0.10_7.zip")
    }
}

tasks.named("startScripts") {
    dependsOn(":lwjgl3:jar")
}
tasks.named<CreateStartScripts>("startScripts") {
    classpath = tasks.named<Jar>("jar").get().outputs.files
}
