package com.deepfine.home.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.deepfine.home.ui.SchemeScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SchemeActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    installSplashScreen()

    setContent {
      SchemeScreen()
    }
  }
}
