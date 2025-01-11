package com.deegolabs.kotlinbasics

import androidx.compose.ui.text.toLowerCase
import androidx.compose.ui.text.toUpperCase

fun main() {
    var computer = ""
    var player: String?  // 타입을 명시하거나, 추론하도록 변수를 선언할 수 있음
    println("Rock Paper or Scissors? ")
    player = readLine()?.lowercase() // readLine()은 null 포함
    val randomNumber = (1 .. 3).random()

    when (randomNumber) {
        1 -> {
            computer = "rock"
        }
        2 -> {
            computer = "paper"
        }
        3 -> {
            computer = "scissors"
        }
    }

    while (!(player == "rock" || player == "paper" || player == "scissors")) {
        println("Please type the right value.")
        player = readLine()?.lowercase()
    }
    println(computer)

    val winner = when {
        player == computer -> "Tie"
        player == "rock" && computer == "scissors" -> "Player wins"
        player == "scissors" && computer == "paper" -> "Player wins"
        player == "paper" && computer == "rock" -> "Player wins"
        else -> "Computer wins"
    }

    println(winner)
}