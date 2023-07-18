package com.hyak4j.kotlin.many

fun main() {
    val list = listOf(5, 1, 2, 7)
    println(list)

    val scores = listOf(68, 88, 78, 99, 100)
    for (score in scores){
        println(score)
    }


    val mutableList = mutableListOf(5, 1, 2, 7)
    mutableList.add(6)
    println(mutableList)

}