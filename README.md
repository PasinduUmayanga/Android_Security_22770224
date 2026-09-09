# Android Security 22770224

[![AppVeyor build](https://ci.appveyor.com/api/projects/status/github/PasinduUmayanga/Android_Security_22770224?branch=main&svg=true)](https://ci.appveyor.com/project/PasinduUmayanga/android-security-22770224/branch/main)
![Android](https://img.shields.io/badge/platform-Android-3DDC84?logo=android&logoColor=white)
![Gradle](https://img.shields.io/badge/build-Gradle-02303A?logo=gradle&logoColor=white)
![Java](https://img.shields.io/badge/language-Java-007396?logo=openjdk&logoColor=white)
![License](https://img.shields.io/badge/license-Not%20specified-lightgrey)

## Tools Required

Install these tools before opening or running the project:

- Android Studio
- JDK 17 or a compatible JDK for Android Gradle Plugin 8.1.2
- Android SDK Platform 34
- Android SDK Build Tools 34.0.0
- Android Emulator or a physical Android device
- Git

Android Studio usually installs the Android SDK, SDK Platform, Build Tools, emulator, and Gradle integration automatically. The project also includes the Gradle wrapper, so a separate Gradle installation is not required.

## Installation and Setup

1. Clone the repository:

```bash
git clone https://github.com/PasinduUmayanga/Android_Security_22770224.git
cd Android_Security_22770224
```

2. Open the project in Android Studio.

3. Let Android Studio sync the Gradle project.

4. If Android Studio asks for missing SDK components, install them from:

```text
File > Settings > Languages & Frameworks > Android SDK
```

5. Make sure the project has a valid SDK path. Android Studio normally creates `local.properties` automatically:

```properties
sdk.dir=C\:\\Users\\YourName\\AppData\\Local\\Android\\Sdk
```

Do not commit `local.properties` because it is machine-specific.

## Run the App

### Run from Android Studio

1. Select an emulator or connected Android device.
2. Click the Run button.
3. Choose the `app` configuration if Android Studio asks.

### Run from Command Line

Build the debug APK:

```powershell
.\gradlew.bat clean assembleDebug
```

Install it on a connected device or running emulator:

```powershell
.\gradlew.bat installDebug
```

On macOS or Linux, use:

```bash
./gradlew clean assembleDebug
./gradlew installDebug
```

The generated APK is available at:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## Run Tests

Run local unit tests:

```powershell
.\gradlew.bat testDebugUnitTest
```

On macOS or Linux:

```bash
./gradlew testDebugUnitTest
```

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

## Continuous Integration

This repository includes an `appveyor.yml` configuration that installs the required Android SDK components, runs unit tests, builds the debug APK, and publishes the APK as a build artifact.
