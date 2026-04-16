plugins {
    kotlin("jvm") version "2.3.10"
    kotlin("plugin.serialization") version "2.3.10"
    application
}

group = "com.cc"
version = "1.0-SNAPSHOT"

val gdxVersion = "1.12.1"

buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://repo.huaweicloud.com/repository/maven/")
        mavenCentral()
    }
}

repositories {
    maven("https://maven.aliyun.com/repository/public")
    maven("https://maven.aliyun.com/repository/google")
    maven("https://maven.aliyun.com/repository/gradle-plugin")
    maven("https://repo.huaweicloud.com/repository/maven/")
    mavenCentral()
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-backend-lwjgl3:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-platform:$gdxVersion:natives-desktop")
    implementation("com.badlogicgames.gdx:gdx-freetype:$gdxVersion")
    implementation("com.badlogicgames.gdx:gdx-freetype-platform:$gdxVersion:natives-desktop")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")
    testImplementation(kotlin("test"))
}

application {
    mainClass.set("com.cc.DesktopLauncherKt")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}

tasks.named<JavaExec>("run") {
    if (System.getProperty("os.name").lowercase().contains("mac")) {
        jvmArgs("-XstartOnFirstThread")
    }
}

// distZip / distTar 启动脚本也加上 JVM 参数
tasks.named<CreateStartScripts>("startScripts") {
    defaultJvmOpts = listOf("-XstartOnFirstThread")
}
