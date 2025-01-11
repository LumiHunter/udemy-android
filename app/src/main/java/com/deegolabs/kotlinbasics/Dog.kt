package com.deegolabs.kotlinbasics

// constructor의 변수에 var, 또는 val이 붙으면 property -> class의 일부이므로 객체. 으로 호출가능)
// 생략되었으면 parameter -> 객체. 으로 호출 불가능
class Dog (val name: String, val breed: String, var age: Int = 0) {
    init {
        bark(name)
    }
    fun bark(name: String) {
        println("$name says Woof! woof!")
    }
}