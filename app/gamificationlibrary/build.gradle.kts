plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("maven-publish") // Apply the maven-publish plugin
    id("org.jetbrains.dokka") version "1.9.20"
}

android {
    namespace = "com.example.gamificationlibrary"
    compileSdk = 35

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        // IMPORTANT: The kotlinCompilerExtensionVersion MUST be compatible with your Compose BOM.
        // Your composeBom = "2025.05.01" (from toml) is very new.
        // kotlinCompilerExtensionVersion = "1.5.11" is too old for such a recent BOM.
        // For Kotlin 2.0.21 and a very recent BOM like 2025.05.01, you'll likely need
        // a compiler extension version like 1.6.0, 1.6.10, or potentially even newer alpha/beta.
        // Please refer to the official Compose to Kotlin compatibility map:
        // https://developer.android.com/jetpack/compose/setup#kotlin-version
        // For now, I'll put a placeholder, but you MUST verify this.
        kotlinCompilerExtensionVersion = "1.6.0" // Placeholder: VERIFY THIS VERSION
    }

}

// Ensure this matches your namespace for consistency
group = "com.example.gamificationlibrary" // Updated for consistency
version = "0.1.4-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = project.group.toString()
            artifactId = "gamification-library"
            version = project.version.toString()

            afterEvaluate {
                from(components["release"])
            }

            pom {
                name.set("Gamification Library for Kotlin")
                description.set("A reusable component-based gamification library in Kotlin.")
                url.set("http://yourcompany.com/gamification-library")
                licenses {
                    license {
                        name.set("The Apache Software License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("your_developer_id")
                        name.set("Your Name")
                        email.set("your.email@example.com")
                    }
                }
                scm {
                    connection.set("scm:git:github.com/yourcompany/gamification-library.git")
                    developerConnection.set("scm:git:ssh://github.com/yourcompany/gamification-library.git")
                    url.set("https://github.com/yourcompany/gamification-library")
                }
            }
        }
    }
    repositories {
        mavenLocal() // Configure to publish to your local Maven repository (~/.m2/repository)
        // If you were publishing to a remote server (e.g., Maven Central, Artifactory), you'd configure it here:
        // maven {
        //     name = "MyRemoteRepo"
        //     url = uri("https://your.remote.repo/releases")
        //     credentials {
        //         username = System.getenv("MAVEN_USERNAME")
        //         password = System.getenv("MAVEN_PASSWORD")
        //     }
        // }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    testImplementation(libs.mockito.core)
    testImplementation(libs.mockito.kotlin)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Jetpack Compose Dependencies
    implementation(platform(libs.androidx.compose.bom)) // Use a compatible Compose BOM version
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3) // Or material if you prefer
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation(libs.androidx.activity.compose.v190)

    // Lifecycle KTX for ViewModel (optional, but good practice for UI state)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.compose) // If you plan to use ViewModels

}