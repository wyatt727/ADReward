plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.adreward"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    // Core Kotlin dependencies - we use the compiler-embeddable which includes all needed compiler parts
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.9.22")
    implementation("org.jetbrains.kotlinx:kotlinx-metadata-jvm:0.9.0")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.22")
    implementation("com.google.code.gson:gson:2.10.1") // For JSON serialization
    
    // Test dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.shadowJar {
    archiveBaseName.set("ktir-scanner")
    archiveClassifier.set("")
    
    // Relocate potential conflict packages
    relocate("org.jetbrains.kotlin", "shadow.org.jetbrains.kotlin")
    relocate("org.intellij", "shadow.org.intellij")
    relocate("com.intellij", "shadow.com.intellij")
    relocate("org.jetbrains.org.objectweb", "shadow.org.jetbrains.org.objectweb")
    relocate("kotlin", "shadow.kotlin")
    
    // Minimize JAR size by excluding unnecessary files
    exclude("META-INF/maven/**")
    exclude("META-INF/versions/**")
    exclude("META-INF/proguard/**")
    
    // Keep our service implementation files
    mergeServiceFiles()
    
    manifest {
        attributes(mapOf(
            "Main-Class" to "com.adreward.ktir.MainKt"
        ))
    }
}

tasks.build {
    dependsOn(tasks.shadowJar)
} 