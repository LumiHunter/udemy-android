package com.deegolabs.kotlinbasics

import kotlin.reflect.typeOf

fun main() {
    var myAge: Byte = 30

    var pi_float = 3.14f
    pi_float = 3.1215926535f    // float의 표현 범위를 벗어난 할당
    println(pi_float)   // float 범위까지만 출력
    var pi_double = 3.1415926535
    println(pi_double)

    var yourAge: UShort = 35u   // u를 붙여줘야 할당 가능(양수만 표현하는 데이터 타입)

    val myTrue = true
    val myFalse = false
    println(myTrue && myFalse)
    println(myTrue || myFalse)
    println(!myFalse)

    val myChar = '\u00AE'   // char는 하나의 유니코드 글자. 즉 유니코드 자체 이용할 수 있음
    println(myChar)

    val mySting = "abcd"
    println(mySting.uppercase())
    for (s in mySting) {
        println(s::class)   // string은 char의 집합
    }
    println("Hwang" + ' ' + "JiEun")

//    var enteredValue = readln() // readln은 기본적으로 String
//    var input = enteredValue.toInt()
    print("Please enter your age as a whole number: ")
    val age = readln().toInt()  // 위 두 줄의 줄임
    if(age in 18..39) {
        println("You can go into the club")
    } else {
        println("You cannot go into the club")
    }

    var userInput = readln()
    while (userInput == "1") {
        println(userInput)
        userInput = readln()
    }
}