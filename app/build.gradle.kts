plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.jsonplaceholderretrofitkotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.jsonplaceholderretrofitkotlin"
        minSdk = 33
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
    buildFeatures {
        viewBinding = true
    }
}
val retrofitVersion = "2.9.0"
val rxJavaVersion = "3.1.5"
val rxAndroidVersion = "3.0.2"
val gsonVersion = "2.10.1"

dependencies {

    //RxJava
    implementation ("io.reactivex.rxjava3:rxjava:$rxJavaVersion")
    //RxAndroid
    implementation ("io.reactivex.rxjava3:rxandroid:$rxAndroidVersion")
    //Retrofit
    implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
    //Gson
    implementation ("com.google.code.gson:gson:$gsonVersion")
    //Gson Converter
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
    //Retrofit-RxJava
    implementation ("com.squareup.retrofit2:adapter-rxjava3:$retrofitVersion")

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}