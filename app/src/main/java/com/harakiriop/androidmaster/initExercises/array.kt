package com.harakiriop.androidmaster.initExercises

fun main(){
    val weekDays = arrayOf("monday", "thuesday", "wednesday", "thuesday", "friday", "saturday", "sunday")

    for(position in weekDays.indices){
        println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        println("The position is $position and his value is $value")
    }
    for(weekday in weekDays){
        println("Weekdays are $weekday")
    }
}