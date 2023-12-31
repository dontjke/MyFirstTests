plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.myfirsttests"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.myfirsttests"
        minSdk = 26
        targetSdk = 33
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

    buildFeatures {
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

    sourceSets {
        getByName("androidTest").java.srcDirs("src/sharedAndroidTestData/java")
        getByName("test").java.srcDirs("src/sharedTestData/java")
    }




    dependencies {

        implementation("androidx.core:core-ktx:1.9.0")
        implementation("androidx.appcompat:appcompat:1.6.1")
        implementation("com.google.android.material:material:1.9.0")
        implementation("androidx.constraintlayout:constraintlayout:2.1.4")
        implementation ("androidx.recyclerview:recyclerview:1.3.2")
        testImplementation("junit:junit:4.13.2")
        androidTestImplementation("androidx.test.ext:junit:1.1.5")
        androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

        //Robolectric
        testImplementation("org.robolectric:robolectric:4.10.3")
        testImplementation("androidx.test:core:1.5.0")
        testImplementation("androidx.test:runner:1.5.2")
        testImplementation("androidx.test.ext:junit:1.1.5")
        testImplementation("androidx.test.ext:truth:1.5.0")
        testImplementation("androidx.test.espresso:espresso-core:3.5.1")
        testImplementation("androidx.test.espresso:espresso-intents:3.5.1")

        androidTestImplementation("androidx.test.uiautomator:uiautomator:2.2.0")

        //Fragment
        debugImplementation ("androidx.fragment:fragment-testing:1.6.1")

        //RecyclerView
        debugImplementation ("androidx.test.espresso:espresso-contrib:3.5.1")


    }
}