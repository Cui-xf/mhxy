plugins {
    kotlin("jvm") version "2.3.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
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