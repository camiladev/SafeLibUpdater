plugins {
    kotlin("jvm") version "2.0.0"
    `java-gradle-plugin`
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.github.ben-manes:gradle-versions-plugin:0.42.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}