package com.example.snake.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Buttons(onDirectionChange:(Pair<Int, Int>) -> Unit) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        CustomButton(
            image = Icons.Default.KeyboardArrowUp,
            onClick = {onDirectionChange(Pair(0, -1)) }
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomButton(
                image = Icons.Default.KeyboardArrowLeft,
                onClick = {onDirectionChange(Pair(-1, 0)) }
            )

            Spacer(modifier = Modifier.padding(horizontal = 32.dp))

            CustomButton(
                image = Icons.Default.KeyboardArrowRight,
                onClick = {onDirectionChange(Pair(1, 0)) }
            )
        }
        CustomButton(
            image = Icons.Default.KeyboardArrowDown,
            onClick = {onDirectionChange(Pair(0, 1)) }
        )
    }
}