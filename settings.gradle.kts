pluginManagement {
    resolutionStrategy {
        eachPlugin {
            if (requested.id.id == "com.github.anuraaga.simple") {
                useModule("com.github.anuraaga:plugin:0.0.1")
            }
        }
    }
    repositories {
        jcenter()
        gradlePluginPortal()
        mavenLocal()
    }
}

/*
plugins {
    id("com.github.anuraaga.simple")
}

config {
    value.set("foo")
}
*/

include(":plugin")
