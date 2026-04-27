buildscript {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots/")
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${properties["kotlinVersion"]}")
    }
}

subprojects {
    version = properties["projectVersion"] as String
    ext["appName"] = "mhxy_m"

    repositories {
        mavenCentral()
        mavenLocal()
        maven("https://central.sonatype.com/repository/maven-snapshots/")
        maven("https://jitpack.io")
        maven("https://teavm.org/maven/repository/")
    }
}

configure(subprojects) {
    apply(plugin = "java-library")
    apply(plugin = "kotlin")

    extensions.configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_21
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }

    tasks.withType<JavaCompile> {
        options.isIncremental = true
    }

}
