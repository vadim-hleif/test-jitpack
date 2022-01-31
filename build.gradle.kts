plugins {
    kotlin("jvm") version "1.5.31"
    kotlin("plugin.allopen") version "1.5.31"

    id("io.quarkus") version "2.5.0.Final"
    maven
}

group = "com.github.vadim-hleif.covalent-sdk-quarkus"

repositories {
    mavenLocal()
    mavenCentral()

    maven("https://jitpack.io")
}

dependencies {
    // BOMs
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(enforcedPlatform("io.quarkus:quarkus-universe-bom:2.5.0.Final"))

    // Quarkus
    api("io.quarkus:quarkus-config-yaml")
    api("io.quarkus:quarkus-smallrye-health")
    api("io.quarkus:quarkus-rest-client-jackson")

    // Kotlin
    implementation("io.quarkus:quarkus-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

allOpen {
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("javax.ws.rs.Path")
}