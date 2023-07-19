package com.example.donutsapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.composable.BottomNavigation
import com.example.donutsapp.navigation.DonutNav


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutApp() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavigation(navController = navController) }
    ) {
        DonutNav(navHostController = navController, modifier = Modifier.padding(it))
    }
}