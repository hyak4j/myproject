package com.hyak4j.kotlin

class Human (var weight: Float, var height: Float) {

    fun bmi(): Float {
        return weight / (height * height)
    }

}