package com.harakiriop.androidmaster.exercises
/*
Por lo general, el teléfono te proporciona un resumen de las notificaciones.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste. El mensaje debe incluir lo siguiente:

La cantidad exacta de notificaciones cuando haya menos de 100
99+ como cantidad de notificaciones cuando haya 100 o más

Que nos devuelva
    -You have 51 notifications.
    -Your phone is blowing up! You have 99+ notifications
 */

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    println(printNotificationSummary(morningNotification))
    println(printNotificationSummary(eveningNotification))
}

fun printNotificationSummary(numberOfMessages: Int): String{
    return when(numberOfMessages){
        in 1..99 -> "you have $numberOfMessages notifications."
        else -> "Your phone is blowing up! you have 99+ notifications."
    }
}