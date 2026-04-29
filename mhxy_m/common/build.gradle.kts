val kotlinVersion: String by project

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
    implementation(kotlin("reflect"))
}

tasks.named<Test>("test") {
    failOnNoDiscoveredTests.set(false)
}
