plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
    signing
}

group = "com.example"
version = "0.0.2"


android {
    namespace = "cn.ming.lib.easypay"
    compileSdk = 34

    defaultConfig {
        minSdk = 21

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")

        aarMetadata {
            minCompileSdk = 21
        }
    }



    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            buildConfigField("boolean", "DEBUG", "false")
        }
        debug {
            buildConfigField("boolean", "DEBUG", "true")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        buildConfig = true
    }


//    buildOutputs.all {
//        val variantOutputImpl = this as com.android.build.gradle.internal.api.BaseVariantOutputImpl
//        val variantName: String = variantOutputImpl.name
//
//        val outputFileName = "${project.name}-${version}-${variantName}" + ".aar"
//        variantOutputImpl.outputFileName = outputFileName
//    }





//     libraryVariants.all { variant ->
//        variant.outputs.all { file ->
//            if (file.outputFileName.endsWith('.aar')) {
//                file.outputFileName = "${project.name}-${variant.buildType.name}-${android.defaultConfig.versionName}.aar"
//            }
//        }
//    }

//    publishing {
//        singleVariant("release") {
//            withSourcesJar()
//            withJavadocJar()
//        }
//    }


}





//tasks {
//    register("androidJavadocJar", Jar::class) {
//        archiveClassifier.set("javadoc")
//        from("${layout.buildDirectory}/javadoc")
//    }
//
//    register("androidSourcesJar", Jar::class) {
//        archiveClassifier.set("sources")
//        from(android.sourceSets.getByName("main").kotlin.srcDirs().toString())
//    }
//}

//afterEvaluate {
//    publishing {
//        publications {
//            create<MavenPublication>("aar") {
//                groupId = "cn.ming.easypay"
//                artifactId = "easypay"
//                version = "1.0.1"
//                from(components["java"])
//            }
//        }
//    }
//}


//afterEvaluate {
//    val androidSourcesJar = tasks.create("androidSourcesJar", Jar::class) {
//        archiveClassifier.set("sources")
//        val androidExtension: BaseExtension =
//            this.project.extensions.getByType(BaseExtension::class)
//        from(androidExtension.sourceSets.getByName("main").java.srcDirs)
//    }
//
//    publishing.publications {
//        create("release", MavenPublication::class.java) {
//            from(components.getByName("release"))
//
//            artifact(androidSourcesJar)
//        }
//    }
//}

//    val androidSourcesJar = tasks.create("androidSourcesJar", Jar::class) {
//        archiveClassifier.set("sources")
//        val androidExtension: BaseExtension =
//            this.project.extensions.getByType(BaseExtension::class)
//        from(androidExtension.sourceSets.getByName("main").java.srcDirs)
//    }





//
//
//
//val androidSourcesJar by tasks.registering(Jar::class) {
//    archiveClassifier.set("sources")
//    from(android.sourceSets["main"].java.srcDirs)
//}
//
////val javadocJar by tasks.registering(Jar::class) {
////    archiveClassifier.set("javadoc")
////    from(tasks.dokkaHtml.get().outputDirectory)
////}
//
//val androidJavadocJar by tasks.registering(Jar::class) {
//    archiveClassifier.set("javadoc")
//    from("${layout.buildDirectory}/javadoc")
//}
//
//
//publishing {
//    publications {
//        create<MavenPublication>("release") {
//            groupId = "io.github.dearming623"
//            artifactId = "easypay"
//            version = "0.0.1-SNAPSHOT"
//            println("---------------------------------------------------------------------------")
//            println(components.toString())
//            println("---------------------------------------------------------------------------")
////                from(components["release"])
//            afterEvaluate {
//                from(components["release"])
//            }
//
//            artifact(androidSourcesJar.get())
//            artifact(androidJavadocJar.get())
//
//            versionMapping {
//                usage("java-api") {
//                    fromResolutionOf("runtimeClasspath")
//                }
//                usage("java-runtime") {
//                    fromResolutionResult()
//                }
//            }
//            pom {
//                name = "EasyPay Library"
//                description = "Simplify and integrate payment modules."
//                url = "https://github.com/dearming623/easypay"
//                properties = mapOf(
//                    "myProp" to "value",
//                    "prop.with.dots" to "anotherValue"
//                )
//                licenses {
//                    license {
//                        name = "The Apache License, Version 2.0"
//                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
//                    }
//                }
//                developers {
//                    developer {
//                        id = "dearming623"
//                        name = "dearming623"
//                        email = "147877305@qq.com"
//                    }
//                }
//                scm {
//                    connection = "scm:git:github.com/dearming623/easypay.git"
//                    developerConnection = "scm:git:ssh://github.com/dearming623/easypay.git"
//                    url = "https://github.com/dearming623/easypay"
//                }
//            }
//        }
//    }
//    repositories {
//        mavenLocal()
////        maven {
////            // change URLs to point to your repos, e.g. http://my.org/repo
////            val releasesRepoUrl = uri(layout.buildDirectory.dir("repos/releases"))
////            val snapshotsRepoUrl = uri(layout.buildDirectory.dir("repos/snapshots"))
////            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
////        }
//        println("publish to repository ----------------------------------")
//    }
//
//    signing {
//        useInMemoryPgpKeys(
//            rootProject.extra["signing.keyId"] as String,
//            rootProject.extra["signing.key"] as String,
//            rootProject.extra["signing.password"] as String,
//        )
//        sign(publishing.publications["release"])
//    }
//}






//ext["signing.keyId"] = System.getenv('SIGNING_KEY_ID') ?: ext["signing.keyId"]
//ext["signing.password"] = System.getenv('SIGNING_PASSWORD') ?: ext["signing.password"]
//ext["signing.secretKeyRingFile"] = System.getenv('SIGNING_SECRET_KEY_RING_FILE') ?: ext["signing.secretKeyRingFile"]


dependencies {

    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.0.4")
    implementation("com.google.android.material:material:1.2.0")
    api(
        fileTree(
            mapOf(
                "dir" to "libs",
                "include" to listOf("*.aar", "*.jar"),
//        "exclude" to listOf()
            )
        )
    )
    implementation("androidx.test:monitor:1.6.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}