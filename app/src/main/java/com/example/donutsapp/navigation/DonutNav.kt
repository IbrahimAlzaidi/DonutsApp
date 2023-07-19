package com.example.donutsapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.donutsapp.ui.screens.boarding.boardingRoute
import com.example.donutsapp.ui.screens.details.detailsRoute
import com.example.donutsapp.ui.screens.home.homeRoute

@Composable
fun DonutNav(
    navHostController: NavHostController,
    modifier: Modifier
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = AppDestination.BoardingScreen.route,
    ) {
        homeRoute(navHostController)

        boardingRoute(navHostController)

        detailsRoute(navHostController)
    }

}