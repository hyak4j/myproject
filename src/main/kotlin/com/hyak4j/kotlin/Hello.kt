package com.hyak4j.kotlin

fun main() {
//    println("Hello Kotlin!")
//    Person().hello()
    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))

    val h = Person(66.5f, 1.7f)
    h.hello()
    println(h.bmi())
    val score = 88;
    println(score > 60)

    val c : Char = 'A'
    println(c.code > 60)
/*    val age : Int = 19;
    var weight = 66.5f;
    var name : String;
    name = "Henry"*/
}

class Person(var weight: Float, var height: Float, var name: String = ""){ // 不重要的參數擺後面
    init {
        println("test $weight")
    }
    // 次要建構子
//    constructor(name: String, weight: Float, height: Float) : this(weight, height)

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello(){
        println("Hello Kotlin!!")
    }
}
