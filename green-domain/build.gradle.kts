import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("plugin.jpa") version "1.4.32"
}

group = "ro.asis"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-mongodb")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.mongodb:bson:4.2.3")
	implementation("org.mongodb:mongodb-driver-sync:4.2.3")
	implementation("org.mongodb:mongodb-driver-core:4.2.3")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.mongodb:mongodb-driver-sync:4.2.3")
	testImplementation("org.mongodb:bson:4.2.3")
	testImplementation("org.mongodb:mongodb-driver-core:4.2.3")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("de.flapdoodle.embed:de.flapdoodle.embed.mongo")

	compileOnly ("org.projectlombok:lombok:1.18.20")
	annotationProcessor ("org.projectlombok:lombok:1.18.20")

	testCompileOnly ("org.projectlombok:lombok:1.18.20")
	testAnnotationProcessor ("org.projectlombok:lombok:1.18.20")
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

val jar: Jar by tasks
val bootJar: org.springframework.boot.gradle.tasks.bundling.BootJar by tasks
bootJar.enabled = false
jar.enabled = true
