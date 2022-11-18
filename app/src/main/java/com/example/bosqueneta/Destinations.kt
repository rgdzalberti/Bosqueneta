package com.example.bosqueneta

sealed class Destinations (val ruta : String) {

    object BosquenetaInicio: Destinations("bosquenetainicio")
    object Pantalla2: Destinations("pantalla2")

}