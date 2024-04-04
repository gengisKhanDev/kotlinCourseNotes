package com.harakiriop.androidmaster.initExercises

fun main(){
    //inmutableList()
    mutableList()
}

fun mutableList(){
    val weekDays: MutableList<String> = mutableListOf("monday", "thuesday", "wednesday", "thuesday", "friday", "saturday", "sunday")
    weekDays.add(3, "grankhan")
    println(weekDays)
}

fun inmutableList(){
    val readOnly: List<String> = listOf("monday", "thuesday", "wednesday", "thuesday", "friday", "saturday", "sunday")
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    //Filter
    val example = readOnly.filter { it.contains("a")}
    println(example)
    readOnly.forEach { weekDay -> println(weekDay) }
}