package com.hyak4j.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {

    // 測試Kotlin類別
    @Test
    fun humanBmiTest(){
        val human = Human(66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), human.bmi())
    }

    // 測試JAVA類別
    @Test
    fun personBmiTest(){
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), person.bmi())
    }
}