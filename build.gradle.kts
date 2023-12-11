plugins {
    scala
    kotlin("jvm") version "1.7.21"
    id("org.gradle.playframework") version "0.14"
    id("net.rdrei.android.buildtimetracker") version "0.11.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

val javaVer: JavaVersion = JavaVersion.VERSION_11
val javaMajorVersion: String = javaVer.majorVersion
val scalaMajor = "2.12"
val scalaVer = "$scalaMajor.18"
val playVer = "2.6.25"
val playCommonsVersion = "2.0.7"
val guiceVer = "6.0.0"

play {
    platform {
        playVersion.set(playVer)
        scalaVersion.set(scalaVer)
        javaVersion.set(javaVer)
    }
    injectedRoutesGenerator = true
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.typesafe.play:play_2.12:$playVer")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.google.inject:guice:$guiceVer")
}

tasks.test {
    useJUnitPlatform()
}