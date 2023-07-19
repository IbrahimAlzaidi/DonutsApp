package com.example.donutsapp.ui.screens.boarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.donutsapp.navigation.AppDestination

fun NavGraphBuilder.boardingRoute(navHostController: NavHostController) {
    composable(AppDestination.BoardingScreen.route) { BoardingScreen(navHostController) }
}