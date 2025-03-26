plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "dunghtph30405.example.pro1121_sp25_nhom1"
    compileSdk = 35

    defaultConfig {
        applicationId = "dunghtph30405.example.pro1121_sp25_nhom1"
        minSdk = 25
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    implementation ("me.relex:circleindicator:2.1.6")
    implementation ("com.github.bumptech.glide:glide:4.16.0")

    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
    implementation ("com.sun.mail:javax.mail:1.6.2")
}