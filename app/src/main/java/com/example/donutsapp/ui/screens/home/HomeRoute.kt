package com.example.donutsapp.ui.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.donutsapp.navigation.AppDestination

fun NavGraphBuilder.homeRoute(navHostController: NavHostController) {
    composable(AppDestination.HomeScreen.route) { HomeScreen(navHostController) }
}

fun NavController.navigateToHomeScreen() {
    navigate(AppDestination.HomeScreen.route)
}