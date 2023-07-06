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
        print(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" +
                if (getAverage() >= 60) "PASS" else "FAILED")
        println("\t" + grading())
    }

    fun grading() :Char{
        var grading = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
        }
        return grading
    }

    fun getAverage() :Int{
        return (english + math) / 2
    }

    fun highest() : Int {
        var max = if (english > math) {
            println("English")
            english
        } else{
            println("Math")
            math
        }
//        if (english > math){
//            max = english
//        }else{
//            max = math
//        }
        return max
    }
    fun nameCheck(){
        println(name?.length)
    }
}
