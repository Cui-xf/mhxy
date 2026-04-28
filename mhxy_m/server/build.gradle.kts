plugins {
    kotlin("jvm")
}

version = "1.0-SNAPSHOT"


dependencies {
    implementation(project(":common"))
    implementation("io.netty:netty-all:4.2.5.Final")
}
