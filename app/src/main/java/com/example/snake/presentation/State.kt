package com.example.snake.presentation

data class State(
    val food: Pair<Int, Int>,
    val snake: List<Pair<Int, Int>>
)
