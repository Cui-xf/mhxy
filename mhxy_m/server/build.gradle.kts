plugins {
    kotlin("jvm")
}

version = "1.0-SNAPSHOT"


dependencies {
    implementation(project(":common"))
    implementation("io.netty:netty-all:4.2.5.Final")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.18.2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.18.2")
    implementation(kotlin("reflect"))
}
