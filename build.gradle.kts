plugins {
  kotlin("jvm") version "1.9.10"
}

group = "id.kotlin.playground"
version = "0.0.1"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
}

tasks.test {
  useJUnitPlatform()
}

kotlin {
  jvmToolchain(17)
}