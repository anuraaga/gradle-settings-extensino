plugins {
    `java-gradle-plugin`
    `maven-publish`
}

base {
    archivesBaseName = "plugin"
}
group = "com.github.anuraaga"
version = "0.0.1"

gradlePlugin {
    plugins {
        create("simple") {
            id = "com.github.anuraaga.simple"
            implementationClass = "SettingsPlugin"
        }
    }
}
