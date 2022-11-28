package com.example.bosqueneta.Navigation

sealed class Destinations (val ruta : String) {

    object Pantalla1: Destinations("bosquenetainicio")
    object Pantalla2: Destinations("pantalla2")

}