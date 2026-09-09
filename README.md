# Android Security 22770224

[![Build status](https://ci.appveyor.com/api/projects/status/vbsfxn9lb7b33e8d?svg=true)](https://ci.appveyor.com/project/Mahadenamuththa/android-security-22770224)
![Android](https://img.shields.io/badge/platform-Android-3DDC84?logo=android&logoColor=white)
![Gradle](https://img.shields.io/badge/build-Gradle-02303A?logo=gradle&logoColor=white)
![Java](https://img.shields.io/badge/language-Java-007396?logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/license-Not%20specified-lightgrey)

Android Security 22770224 is a simple native Android application that demonstrates a registration and sign-in flow backed by a local SQLite database helper. The app is built with Java, AndroidX AppCompat, Material Components, and ConstraintLayout.

## Features

- Registration screen with username, password, and password confirmation fields
- Navigation from registration to sign-in and home screens
- SQLite helper for storing and validating user credentials
- Gradle wrapper included for repeatable local and CI builds

## Project Structure

- `app/src/main/java/com/example/android_security_22770224/` - Java activity and database helper classes
- `app/src/main/res/layout/` - XML layouts for registration, sign-in, and home screens
- `app/build.gradle.kts` - Android app module configuration
- `gradle/wrapper/` - Gradle wrapper files

## Requirements

- Android Studio or Android SDK command-line tools
- JDK 17 or compatible JDK for Android Gradle Plugin 8.1.2
- Android SDK Platform 34

## Build

Use the Gradle wrapper from the repository root:

```powershell
.\gradlew.bat clean assembleDebug
```

On macOS or Linux:

```bash
./gradlew clean assembleDebug
```

The debug APK is generated at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## Test

Run the local unit tests with:

```powershell
.\gradlew.bat testDebugUnitTest
```

## Continuous Integration

This repository includes an `appveyor.yml` configuration that installs the required Android SDK components, runs unit tests, builds the debug APK, and publishes the APK as a build artifact.
