@file:Suppress("UnstableApiUsage")

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  id(libs.plugins.deepfine.presentation.get().pluginId)
  id(libs.plugins.kotlin.serialization.get().pluginId)
}

android {
  namespace = "com.deepfine.scheme"
}

dependencies {
  implementation(project(":presentation"))
  implementation(project(":presentation:fact"))

  implementation(libs.splashScreen)
  implementation(libs.kotlin.serialization)
}
