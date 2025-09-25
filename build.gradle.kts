plugins {
    kotlin("jvm") version "2.1.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("junit:junit:1.3.0"))
    testImplementation(kotlin("io.mockk:mockk:1.14.5"))
}

tasks.test {
    useJUnitPlatform()
}