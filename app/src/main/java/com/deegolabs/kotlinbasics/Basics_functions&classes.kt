package com.deegolabs.kotlinbasics

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
    )

fun main() {
    val coffeeForMe = CoffeeDetails(0, "JiEun", "Tall", 1)
    makeCoffee(coffeeForMe)
}

fun divide(num1: Int, num2: Int): Double {
    val result = num1/num2.toDouble()  // 연산 안에 Int가 하나라도 있으면 결과도 Int로 추론함
    return result
}

fun add(num1:Int, num2:Int):Int {
    val result = num1+num2
    return result
}
fun askCoffeeDatails() {
    println("Who is this coffee for?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln().toInt()
    //makeCoffee(sugarCount, name)
}
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    var checkSugar = coffeeDetails.sugarCount // 함수 안의 매개변수는 val이기 때문에, 변화가 생길 수 있다면 이렇게 var에 할당
    while (checkSugar < 0) {
        println("The amount of sugar can't be less than zero")
        checkSugar = readln().toInt()
    }
    var answer = when {
        checkSugar == 1 -> "Coffee with 1 spoon of sugar"
        checkSugar == 0 -> "Coffee with no sugar"
        else -> "Coffee with $checkSugar spoons of sugar"
    }
    println(answer + " and ${coffeeDetails.creamAmount} cream and size ${coffeeDetails.size} for ${coffeeDetails.name}")
}