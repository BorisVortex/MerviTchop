plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.vortex.mervitchop"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.vortex.mervitchop"
        minSdk = 29
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.1")
    implementation("com.google.android.material:material:1.14.0")
    implementation("androidx.constraintlayout:constraintlayout:2.2.1")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.10.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.10.0")
    implementation("androidx.navigation:navigation-fragment:2.9.8")
    implementation("androidx.navigation:navigation-ui:2.9.8")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.7.0")

    implementation (platform("com.google.firebase:firebase-bom:34.13.0"))
    implementation ("com.google.firebase:firebase-analytics")
    implementation ("com.google.firebase:firebase-auth:24.1.0")
    implementation ("com.google.firebase:firebase-database:22.0.1")
    implementation ("com.google.firebase:firebase-storage:22.0.1")
    implementation ("com.google.firebase:firebase-storage-ktx:21.0.2")

    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.google.firebase:firebase-database-ktx:21.0.0")
    implementation ("com.android.car.ui:car-ui-lib:2.6.0")
    implementation ("com.google.firebase:firebase-auth-ktx:23.2.1")

    implementation ("com.github.ismaeldivita:chip-navigation-bar:1.4.0")
    implementation ("com.github.bumptech.glide:glide:5.0.7")
    annotationProcessor ("com.github.bumptech.glide:compiler:5.0.7")

    implementation ("com.karumi:dexter:6.2.3")
    implementation ("com.chauthai.swipereveallayout:swipe-reveal-layout:1.4.1")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.airbnb.android:lottie:6.7.1")
    implementation ("com.tbuonomo:dotsindicator:5.1.0")
    implementation ("com.etebarian:meow-bottom-navigation:1.2.0")
    
    
    
    
    
    
    
    
    
    
    
}