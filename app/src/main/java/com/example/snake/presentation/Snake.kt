package com.example.snake.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.LayoutDirection
import com.example.snake.presentation.components.Board
import com.example.snake.presentation.components.Buttons
import com.example.snake.presentation.utils.Game

@Composable
fun Snake(game: Game) {
    val state = game.state.collectAsState(initial = null)

    CompositionLocalProvider(
        LocalLayoutDirection provides LayoutDirection.Ltr
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            state.value?.let {
                Board(it)
            }

            Buttons(onDirectionChange = {
                game.move = it
            })
        }
    }
}