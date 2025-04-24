buildscript {
    repositories {
//        maven(url = "https://plugins.gradle.org/m2/")
//        maven(url = "https://maven.aliyun.com/nexus/content/repositories/google")
//        maven(url = "https://maven.aliyun.com/nexus/content/groups/public")
//        maven(url = "https://maven.aliyun.com/nexus/content/repositories/jcenter")
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
    }
}

plugins {
    id("com.android.application") version "8.3.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.android.library") version "8.3.2" apply false
}

extra["signing.keyId"] = ""
extra["signing.password"] = ""
extra["signing.key"] = ""
extra["ossrhUsername"] = ""
extra["ossrhPassword"] = ""
extra["sonatypeStagingProfileId"] = ""


val secretPropsFile = project.rootProject.file("local.properties")
if (secretPropsFile.exists()) {
    val properties = java.util.Properties().apply {
        load(secretPropsFile.inputStream())
    }
    properties.forEach { name, value -> extra[name as String] = value }
} else {
    extra["ossrhUsername"] = System.getenv("OSSRH_USERNAME")
    extra["ossrhPassword"] = System.getenv("OSSRH_PASSWORD")
    extra["sonatypeStagingProfileId"] = System.getenv("SONATYPE_STAGING_PROFILE_ID")
    extra["signing.keyId"] = System.getenv("SIGNING_KEY_ID")
    extra["signing.password"] = System.getenv("SIGNING_PASSWORD")
    extra["signing.key"] = System.getenv("SIGNING_KEY")
}

println("extra: ------------> " + extra.properties.toString())