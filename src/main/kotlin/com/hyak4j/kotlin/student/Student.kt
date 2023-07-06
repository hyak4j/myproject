package com.hyak4j.kotlin.student

import java.util.Scanner

fun main() {
//    userInput()
    val student = Student("Henry", 80, 90)
    student.print()
    println("High score: ${student.highest()}")
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
//    println("Please enter student`s name: ")
    var name = null
    println("Please enter student`s English score: ")
    var english = scanner.nextInt()
    println("Please enter student`s Math score: ")
    var math = scanner.nextInt()
    val student = Student(name, english, math)
    student.print()
    student.nameCheck()
}

class Student(var name: String?, var english: Int, var math: Int) {
    fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
        println("English")
        english
    } else{
        println("Math")
        math
    }

    fun nameCheck() =  println(name?.length)
}
