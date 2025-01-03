plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.photogallery2"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.photogallery2"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.retrofit)
    implementation(libs.converter.scalars)
    implementation(libs.gson)
    implementation(libs.retrofit2.converter.gson)

    implementation("androidx.work:work-runtime:2.10.0")
    implementation("androidx.work:work-runtime-ktx:2.10.0")
    implementation("androidx.work:work-rxjava2:2.10.0")
    implementation("androidx.work:work-gcm:2.10.0")
    androidTestImplementation("androidx.work:work-testing:2.10.0")
    implementation("androidx.work:work-multiprocess:2.10.0")

    implementation(libs.androidx.lifecycle.extensions)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.core.ktx)

    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}