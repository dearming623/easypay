import org.jetbrains.kotlin.gradle.targets.js.npm.includedRange

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "cn.ming.easypay"
    compileSdk = 34

    defaultConfig {
        applicationId = "cn.ming.easypay"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    //改输出包名
//    applicationVariants.all(
//        object : Action<com.android.build.gradle.api.ApplicationVariant> {
//            override fun execute(variant: com.android.build.gradle.api.ApplicationVariant) {
//                println("variant: $variant")
//                variant.outputs.all(
//                    object : Action<com.android.build.gradle.api.BaseVariantOutput> {
//                        override fun execute(
//                            output: com.android.build.gradle.api.BaseVariantOutput
//                        ) {
//                            val outputImpl = output as com.android.build.gradle.internal.api.BaseVariantOutputImpl
//                            val fileName = "xxx"
//                            println("output file name: $fileName")
//                            outputImpl.outputFileName = fileName
//                        }
//                    }
//                )
//            }
//        }
//    )

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.0")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation(project(":easypay"))
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
//    implementation(fileTree(mapOf(
//        "dir" to "libs",
//        "include" to listOf("*.aar", "*.jar"),
////        "exclude" to listOf()
//    )))
}