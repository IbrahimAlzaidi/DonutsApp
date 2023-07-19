package com.example.donutsapp.navigation

sealed class AppDestination(val route: String) {

    object BoardingScreen : AppDestination("boardingScreen")

    object HomeScreen : AppDestination("homeScreen")

    object DetailsScreen : AppDestination("detailsScreen")

}

