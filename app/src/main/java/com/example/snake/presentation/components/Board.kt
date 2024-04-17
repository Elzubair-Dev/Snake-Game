package com.example.snake.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.snake.presentation.utils.Game
import com.example.snake.presentation.State

@Composable
fun Board(state: State) {
    BoxWithConstraints(modifier = Modifier.padding(16.dp)) {
        val tileSize = maxWidth / Game.BOARD_SIZE

        Box(modifier = Modifier
            .size(maxWidth)
            .border(2.dp, Color.Black))

        Box(
            modifier = Modifier
                .offset(x = tileSize * state.food.first, y = tileSize * state.food.second)
                .size(tileSize)
                .background(Color.Red, CircleShape)
        )

        state.snake.forEach {
            Box(
                modifier = Modifier
                    .offset(x = tileSize * it.first, y = tileSize * it.second)
                    .size(tileSize)
                    .background(Color.Cyan, CircleShape)
            )
        }
    }
}