package com.example.donutsapp.composable

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Pink90

@Composable
fun FavoriteAnimation(
    modifier: Modifier = Modifier,
    roundedSize: Int = 8,
    iconState: Boolean,
    onClickIconFavorite: () -> Unit
) {

    val transition = updateTransition(targetState = iconState, label = "iconFavoriteAnimation")
    val iconColor = transition.animateColor(label = "") { transitionState ->
        when (transitionState) {
            true -> Color.White
            false -> Pink90
        }
    }

    val backgroundIconColor = transition.animateColor(label = "") { transitionState ->
        when (transitionState) {
            true -> Pink90
            false -> Color.White
        }
    }

    RoundedButton(
        modifier = modifier.padding(16.dp),
        tintColor = backgroundIconColor.value,
        roundedSize = roundedSize,
        onClick = { onClickIconFavorite() },
    ) {
        Icon(
            painter = painterResource(id = R.drawable.heart_add_to_favourite),
            contentDescription = "like",
            tint = iconColor.value
        )
    }
}