package com.deegolabs.kotlinbasics

fun main() {
    // immutable
    val shopList = listOf("Processor", "RAM", "SSD", "Graphics card")
    // mutable
    val shoppingList = mutableListOf("Processor", "Graphics card RTX 3060", "RAM", "SSD")

    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics card RTX 3060")
    shoppingList.add("Graphics card RTX 4090")
    shoppingList.removeAt(1)
    println(shoppingList)
    shoppingList.add(3, "RAM")
    println(shoppingList)

    // 수정하는 두가지 방법 -> 인덱스에 접근해서 넣기, set 메소드 쓰기
    shoppingList[4] = "Graphics Card RX 7800XT"
    println(shoppingList)
    shoppingList.set(2, "Water Cooling")
    println(shoppingList)

    if (shoppingList.contains("RAM")) {
        println("Has RAM in the list")
    } else {
        println("No RAM in the list")
    }

    for (item in shoppingList) {
        println(item)
    }

    // 인덱스로 접근하는 for: shoppingList.size = 5
    for(index in 0 until shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }

    // ..   (range) 표현과의 차이
    for (index in 0 .. 4) {
        println("item ${shoppingList[index]} is at index $index")
    }
}