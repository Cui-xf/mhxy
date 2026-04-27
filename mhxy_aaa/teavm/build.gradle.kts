plugins {
    java
}

val gdxVersion: String by project
val gdxTeaVMVersion: String by project

sourceSets.main {
    resources.srcDir(rootProject.file("assets").path)
}

val mainClassName = "com.cc.teavm.TeaVMBuilder"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation("com.badlogicgames.gdx:gdx-box2d-gwt:$gdxVersion")
    implementation("com.github.xpenatan.gdx-teavm:backend-web:$gdxTeaVMVersion")
    implementation("com.github.xpenatan.gdx-teavm:gdx-freetype-teavm:$gdxTeaVMVersion")
    implementation(project(":core"))
}

tasks.register<JavaExec>("runRelease") {
    description = "Run the TeaVM application hosted via a local Jetty server at http://localhost:8080/"
    group = "application"
    dependsOn(tasks.classes)
    mainClass.set(mainClassName)
    classpath = sourceSets.main.get().runtimeClasspath
    args("run")
}

tasks.register<JavaExec>("runDebug") {
    description = "Run the TeaVM application with debug enabled hosted via a local Jetty server at http://localhost:8080/"
    group = "application"
    dependsOn(tasks.classes)
    mainClass.set(mainClassName)
    classpath = sourceSets.main.get().runtimeClasspath
    args("debug", "run")
}

tasks.register<JavaExec>("buildRelease") {
    description = "Build the TeaVM application; doesn't run directly"
    group = "build"
    dependsOn(tasks.classes)
    mainClass.set(mainClassName)
    classpath = sourceSets.main.get().runtimeClasspath
}

tasks.register<JavaExec>("buildDebug") {
    description = "Build the TeaVM application with debug enabled; doesn't run directly"
    group = "build"
    dependsOn(tasks.classes)
    mainClass.set(mainClassName)
    classpath = sourceSets.main.get().runtimeClasspath
    args("debug")
}

tasks.register("run") {
    dependsOn("runRelease")
}

tasks.build {
    dependsOn("buildRelease")
}
