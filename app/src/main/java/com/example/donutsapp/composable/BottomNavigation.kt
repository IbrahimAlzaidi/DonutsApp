package com.example.donutsapp.composable

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.donutsapp.navigation.AppDestination
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Pink90

@Composable
fun BottomNavigation(navController: NavHostController) {
    val current = navController.currentBackStackEntryAsState()
    val selectedScreen = current.value?.destination?.route

    val icons = remember {
        mutableStateOf(
            listOf(
                R.drawable.ic_home,
                R.drawable.ic_heart_bottom_navigation,
                R.drawable.ic_notification,
                R.drawable.ic_cart,
                R.drawable.ic_profile,
            )
        )
    }

    AnimatedVisibility(
        visible = selectedScreen == AppDestination.HomeScreen.route,
        enter = slideInVertically(animationSpec = tween(1000), initialOffsetY = { it }),
        exit = slideOutVertically(animationSpec = tween(1000), targetOffsetY = { it })
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Transparent)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(icons.value.size) { index ->
                Icon(
                    modifier = Modifier
                        .clip(CircleShape)
                        .clickable {

                        }
                        .padding(8.dp),
                    painter = painterResource(id = icons.value[index]),
                    contentDescription = "bottom nav icons",
                    tint = Pink90
                )
            }
        }
    }
}