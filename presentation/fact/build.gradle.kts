@file:Suppress("UnstableApiUsage")

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
  id(libs.plugins.deepfine.presentation.get().pluginId)
}

android {
  namespace = "com.deepfine.fact"
}

dependencies {
  implementation(project(":presentation"))
}
