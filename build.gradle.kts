plugins {
    id("com.android.application") version "8.3.0-alpha14" apply false
    id("com.github.ben-manes.versions") version "0.50.0"
    id("org.jetbrains.kotlin.android") version "1.9.20" apply false
}

buildscript {
    dependencies {
        classpath("com.google.firebase:firebase-crashlytics-gradle:2.9.9")
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.6")
        classpath("com.google.gms:google-services:4.4.0")
    }
}
