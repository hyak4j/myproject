package com.hyak4j.kotlin.student

import java.util.Scanner

fun main() {
//    userInput()
    Student.pass = 10
    val student = Student("Henry", 80, 90)
    val student2 = Student("Tom", 30, 20)
    val student3 = Student("James", 50, 40)

    val gstu = GraduateStudent("Eric", 60, 60, 60)
    gstu.print()
    student.print()
    student2.print()
    student3.print()
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

class GraduateStudent(name: String?, english: Int, math: Int, var thesis : Int) : Student(name, english, math){
    companion object{
        var pass = 70
    }

    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    companion object{
        @JvmStatic
        var pass = 60
        fun test(){
            println("testing")
        }
    }

    open fun print(){
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when(getAverage()){
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

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
