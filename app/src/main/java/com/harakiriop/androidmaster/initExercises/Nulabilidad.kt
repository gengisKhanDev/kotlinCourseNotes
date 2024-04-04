package com.harakiriop.androidmaster.initExercises

fun main(){
    var name:String? = "Gran khan"
    // ?: this symbol his called "elvis" if the value is null, "the value is null"
    // return in the println, if the value is not null, print the get(3)
    println(name?.get(3) ?: "The value is null")
}