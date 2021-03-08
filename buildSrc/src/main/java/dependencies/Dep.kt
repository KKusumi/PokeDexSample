package dependencies

object Dep {

    object Plugin {
        val gradle = "com.android.tools.build:gradle:4.1.2"
        val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10"
        val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:2.3.3"
    }

    object AndroidX {
        val appCompat = "androidx.appcompat:appcompat:1.2.0"
        val coreKtx = "androidx.core:core-ktx:1.3.2"
        val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.4"

        object Lifecycle {
            val version = "2.2.0"
            val liveData = "androidx.lifecycle:lifecycle-livedata:$version"
            val liveDataCoreKtx = "androidx.lifecycle:lifecycle-livedata-core-ktx:$version"
            val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
        }

        object Navigation {
            private val version = "2.3.3"
            val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
            val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Room {
            private val version = "2.2.6"
            val runtime = "androidx.room:room-runtime:$version"
            val conpiler = "androidx.room:room-compiler:$version"
            val ktx = "androidx.room:room-ktx:$version"
        }
    }

    object Google {
        val material = "com.google.android.material:material:1.3.0"
        val gson = "com.google.code.gson:gson:2.8.6"
    }

    object Kotlin {
        val version = "1.4.10"
        val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"

        object Coroutine {
            val version = "1.4.2"
            val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
            val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        }
    }

    object Koin {
        val version = "2.0.1"
        val core = "org.koin:koin-core:$version"
        val coreExt = "org.koin:koin-core-ext:$version"
        val android = "org.koin:koin-android:$version"
        val androidScope = "org.koin:koin-android-scope:$version"
        val androidViewModel = "org.koin:koin-android-viewmodel:$version"
        val androidExt = "org.koin:koin-android-ext:$version"
        val androidxExt = "org.koin:koin-androidx-ext:$version"
        val androidxViewModel = "org.koin:koin-androidx-viewmodel:$version"
    }

    object Epoxy {
        val version = "4.1.0"
        val epoxy = "com.airbnb.android:epoxy:$version"
        val dataBinding = "com.airbnb.android:epoxy-databinding:$version"
        val processor = "com.airbnb.android:epoxy-processor:$version"
    }

    object Square {
        object OkHttp {
            val version = "4.9.0"
            val okHttp = "com.squareup.okhttp3:okhttp:$version"
            val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
        }

        object Retrofit {
            val version = "2.9.0"
            val retrofit = "com.squareup.retrofit2:retrofit:$version"
            val converterGson = "com.squareup.retrofit2:converter-gson:$version"
        }
    }

    object Glide {
        val version = "4.11.0"
        val glide = "com.github.bumptech.glide:glide:$version"
        val compiler = "com.github.bumptech.glide:compiler:$version"
    }

    object Other {
        object KotlinResult {
            val version = "1.1.10"
            val kotlinResult = "com.michael-bull.kotlin-result:kotlin-result:$version"
        }
    }
}