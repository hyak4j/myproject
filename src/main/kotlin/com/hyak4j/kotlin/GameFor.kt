package com.hyak4j.kotlin

import java.util.Random
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10) + 1
    for (i in 1..4){
        println("Please enter a number (${i}/4): ")
        val number = scanner.nextInt()
        println("第${i}次$number")
        if (number == -1) break

        if (number > secret){
            println("Lower")
        }else if (number < secret){
            println("Higher")
        }else{
            println("Bingo!")
            break
        }
    }
    println("End")
}