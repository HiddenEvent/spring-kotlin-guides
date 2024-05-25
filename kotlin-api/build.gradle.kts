tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}


dependencies {
//    implementation(project(":support:logging"))
    runtimeOnly(project(":storage:rdb"))
    implementation("org.springframework.boot:spring-boot-starter-web")
}