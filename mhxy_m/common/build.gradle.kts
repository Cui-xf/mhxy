val kotlinVersion: String by project

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
}

tasks.named<Test>("test") {
    failOnNoDiscoveredTests.set(false)
}
