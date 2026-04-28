buildscript {
    repositories {
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://maven.aliyun.com/repository/public")
        maven("https://repo.huaweicloud.com/repository/maven/")
        maven("https://central.sonatype.com/repository/maven-snapshots/")
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${properties["kotlinVersion"]}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${properties["kotlinVersion"]}")
    }
}

apply(plugin = "base")

subprojects {
    version = properties["projectVersion"] as String
    ext["appName"] = "mhxy_m"

    repositories {
        maven("https://maven.aliyun.com/repository/public")
        maven("https://maven.aliyun.com/repository/google")
        maven("https://maven.aliyun.com/repository/gradle-plugin")
        maven("https://repo.huaweicloud.com/repository/maven/")
        maven("https://central.sonatype.com/repository/maven-snapshots/")
        maven("https://jitpack.io")
        maven("https://teavm.org/maven/repository/")
        mavenCentral()
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
