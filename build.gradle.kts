import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.6.7"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Mybatis
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.2.2")
    implementation("org.mybatis.dynamic-sql:mybatis-dynamic-sql:1.4.0")

    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val mybatisMapperVersion = "4.1.5"
val mybatisGeneratorVersion = "1.4.0"
val mysqlConnectorJavaVersion = "8.0.22"

val mybatisGenerator by configurations.creating

dependencies {
    mybatisGenerator(
        group = "org.mybatis.generator",
        name = "mybatis-generator-core",
        version = mybatisGeneratorVersion
    )
    mybatisGenerator(group = "mysql", name = "mysql-connector-java", version = mysqlConnectorJavaVersion)
    mybatisGenerator(group = "tk.mybatis", name = "mapper", version = mybatisMapperVersion)
}
task("mybatisGenerator") {
    doLast {
        ant.withGroovyBuilder {
            "taskdef"(
                "name" to "mbgenerator",
                "classname" to "org.mybatis.generator.ant.GeneratorAntTask",
                "classpath" to mybatisGenerator.asPath
            )
        }
        ant.withGroovyBuilder {
            "mbgenerator"(
                "overwrite" to true, "configfile" to
                        "src/main/resources/mbg-config.xml", "verbose" to true
            )
        }
    }
}