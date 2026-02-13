plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.listycity"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        applicationId = "com.example.listycity"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    // Source - https://stackoverflow.com/a/73009440
// Posted by Sriraksha, modified by community. See post 'Timeline' for change history
// Retrieved 2026-02-12, License - CC BY-SA 4.0

    testOptions {
        unitTests.all {
            it.useJUnitPlatform()
        }
    }

}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.10.2")
    implementation(libs.constraintlayout)
    //implementation(files("/Users/huayuzhao/Library/Android/sdk/platforms/android-36/android.jar"))
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
