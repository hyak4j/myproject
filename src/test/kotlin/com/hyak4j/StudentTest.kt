package com.hyak4j

import com.hyak4j.kotlin.student.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest {
    val english = 60
    val math = 80

    @Test
    fun highestTest(){
        val student = Student("Herny", english, math)
        Assertions.assertEquals(math, student.highest())
    }

    @Test
    fun averageTest(){
        val student = Student("Herny", english, math)
        Assertions.assertEquals((english + math) / 2, student.getAverage())
    }

    @Test
    fun gradingTest(){
        val student = Student("Herny", english, math)
        Assertions.assertEquals('C', student.grading())
    }
}