plugins {
    id("kotlinx-serialization")
}

val kotlinVersion: String by project

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    compileOnly("org.jetbrains.kotlinx:kotlinx-serialization-json:1.8.1")
}

tasks.named<Test>("test") {
    failOnNoDiscoveredTests.set(false)
}
