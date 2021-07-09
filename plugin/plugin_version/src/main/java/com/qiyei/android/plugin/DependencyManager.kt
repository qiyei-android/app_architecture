package com.qiyei.android.plugin


/**
 * 如果数量少的话，放在一个类里面就可以，如果数量多的话，可以拆分为多个类
 */

object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:1.4.32"
    const val stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.4.32"
    const val stdlib_jdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.4.32"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:1.4.32"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:1.2.0"
    const val core_ktx = "androidx.core:core-ktx:1.3.1"
    const val constraint_layout = "androidx.constraintlayout:constraintlayout:2.0.4"
    const val material = "com.google.android.material:material:1.2.1"
    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
}

object Network {
    const val okhttp = "com.squareup.okhttp3:okhttp:4.9.1"
}

object Hilt {
    const val hilt_android = "com.google.dagger:hilt-android:2.36"
    const val hilt_android_compiler = "com.google.dagger:hilt-android-compiler:2.36"
}

object Test {
    const val junit = "junit:junit:4.12"
    const val android_test_junit = "androidx.test.ext:junit:1.1.2"
    const val espresso_core = "androidx.test.espresso:espresso-core:3.3.0"
}

