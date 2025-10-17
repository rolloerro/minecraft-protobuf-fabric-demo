plugins {
    id("fabric-loom") version "1.7.4"
    id("com.google.protobuf") version "0.9.4"
    id("maven-publish")
}

group = "org.example"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.1")
    mappings("net.fabricmc:yarn:1.21.1+build.1:v2")
    modImplementation("net.fabricmc:fabric-loader:0.15.11")

    // Protobuf runtime
    implementation("com.google.protobuf:protobuf-java:3.25.3")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

protobuf {
    // ✅ Gradle сам скачает protoc
    protoc {
        artifact = "com.google.protobuf:protoc:3.25.3"
        // Если хочешь использовать локальный protoc (brew install protobuf):
        // path = "/opt/homebrew/bin/protoc"
    }
    generateProtoTasks {
        all().forEach { task ->
            task.builtins {
                maybeCreate("java")
            }
        }
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<ProcessResources> {
    inputs.property("version", project.version)

    filesMatching("fabric.mod.json") {
        expand(mapOf("version" to project.version))
    }
}
