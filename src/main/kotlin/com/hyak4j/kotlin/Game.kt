package com.hyak4j.kotlin

import java.util.*

fun main() {
//    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10) + 1
    var number = 0

    while (number != secret){
        println("Please enter a number: ")
//        number = scanner.nextInt()
        number = readLine()!!.toInt()
        if (number > secret){
            println("Lower~")
        }else if (number < secret){
            println("Higher~")
        }else{
            println("Bingo! the number is $number")
        }
    }
}