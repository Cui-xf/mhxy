plugins {
    kotlin("jvm") version "2.3.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://maven.aliyun.com/repository/public")
    maven("https://maven.aliyun.com/repository/google")
    maven("https://maven.aliyun.com/repository/gradle-plugin")
    maven("https://repo.huaweicloud.com/repository/maven/")
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.netty:netty-all:4.1.119.Final")
}

kotlin {
    jvmToolchain(21)
}

tasks.test {
    useJUnitPlatform()
}