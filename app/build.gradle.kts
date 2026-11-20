
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.solar3dexplorer"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.solar3dexplorer"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
