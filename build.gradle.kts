plugins {
    java
    id("org.springframework.boot") version "3.1.1"
    id("io.spring.dependency-management") version "1.1.0"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    group = "org.indefinite"
    version = "1.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        val testImplementation by configurations
        val implementation by configurations
        implementation("org.springframework.boot:spring-boot-starter")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
    }

    tasks.test {
        useJUnitPlatform()
    }

    task("hello") {
        doLast {
            println("I'm ${project.name}")
        }
    }
}
