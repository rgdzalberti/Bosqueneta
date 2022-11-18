package com.example.bosqueneta

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationHost(){
    val navController = rememberNavController()

    NavHost(navController, startDestination = Destinations.BosquenetaInicio.ruta)
}