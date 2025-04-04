import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    kotlin("plugin.spring") apply false
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

java.sourceCompatibility = JavaVersion.VERSION_17

val projectGroup: String by project
val applicationVersion: String by project
val springCloudVersion: String by project
configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }

}


allprojects {
    group = projectGroup
    version = applicationVersion

    repositories {
        mavenCentral()
    }

}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation(platform("org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"))
        annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.getByName("bootJar") {
        enabled = false
    }

    tasks.getByName("jar") {
        enabled = true
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}


