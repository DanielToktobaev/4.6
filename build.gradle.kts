buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.8.5"
        classpath (libs.androidx.navigation.safe.args.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.devtools.ksp") version "2.1.0-1.0.29" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}