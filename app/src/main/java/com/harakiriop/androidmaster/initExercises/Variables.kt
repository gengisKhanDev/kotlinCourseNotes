package com.harakiriop.androidmaster.initExercises

fun main(){
//    showMyName()
//    showMyAge(24)
//    add(23, 4)
//    var dataSubstract = substract(10, 5)
//    println("the substract is $dataSubstract")
    getWeek(6)
    getSemester(3)
}
fun getWeek(currentWeek: Int){
    when (currentWeek){
        1 -> println("monday")
        2 -> println("thueday")
        3 -> println("wednesday")
        4 -> println("thursday")
        5 -> {
            println("friday")
            println("and is being to weekend")
        }
        6 -> println("saturday")
        7 -> println("sunday")
        else -> println("Is not a day week")
    }
}

fun getSemester(currentWeek: Int){
    // we can use range in "when operator" if the value are many
    when (currentWeek){
        in 1..6 -> println("firstSemester")
        in 7..12 -> println("secondSemester")
        !in 1..12 -> println("Is not a day week")
    }
}

fun showMyName() {
    println("Me llamo Gengis")
}

fun showMyAge(currentAge: Int){
    println("Tengo $currentAge")
}

fun add(firstNumber: Int, secondNumber: Int){
    println(firstNumber + secondNumber)
}

// In the function substract you need to declare the data type in the example Int
// and add return to the answare that your function
fun substract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}