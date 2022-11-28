package com.example.bosqueneta

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bosqueneta.Navigation.Destinations

@Composable
fun NavigationHost (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Destinations.Pantalla1.ruta)
    {
        composable(route = Destinations.Pantalla1.ruta){
            BosquenetaInicio(navController)
        }
        composable(route = Destinations.Pantalla2.ruta){
            elegirOpcion()
        }

    }
}





