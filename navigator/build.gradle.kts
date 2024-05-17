plugins {
  id(libs.plugins.android.library.get().pluginId)
  kotlin("android")
}

android {
  namespace = "com.deepfine.navigator"

  compileSdk = libs.versions.compileSdk.get().toInt()

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  buildFeatures.compose = true
  composeOptions.kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
}

dependencies {
  implementation(libs.androidx.compose.navigation)
}
