package com.deepfine.home.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.deepfine.home.route.Screen
import com.deepfine.home.route.argumentedRoute
import com.deepfine.home.route.createArgument

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 */

@Composable
internal fun MainScreen() {
  val navController = rememberNavController()

  NavHost(
    navController = navController,
    startDestination = Screen.Fact.destination,
  ) {
    factGraph(navController)
  }
}

private fun NavGraphBuilder.factGraph(navController: NavController) {
  navigation(startDestination = Screen.Fact.route, route = Screen.Fact.destination) {
    composable(route = Screen.Fact.route) {
      FactScreen({ fact -> navController.navigate(Screen.Fact.Detail.argumentedRoute(fact)) })
    }

    dialog(
      route = Screen.Fact.Detail.route,
      arguments = Screen.Fact.Detail.createArgument(false),
      dialogProperties = DialogProperties(
        dismissOnBackPress = true,
        dismissOnClickOutside = true,
        usePlatformDefaultWidth = false,
      ),
    ) { _ ->
      FactDetailDialog()
    }
  }
}
