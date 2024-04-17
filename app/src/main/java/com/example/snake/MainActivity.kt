package com.example.snake

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.example.snake.presentation.Snake
import com.example.snake.presentation.utils.Game
import com.example.snake.ui.theme.SnakeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val game = Game(lifecycleScope)
        setContent {
            SnakeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Snake(game = game)
                }
            }
        }
    }
}