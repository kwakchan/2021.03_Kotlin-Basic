package com.example.myapplication

import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val dan = sc.nextInt()

    for(hang in 1..9) {
        println("$dan x $hang =" + dan * hang)
    }
}