package com.example.myapplication

import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val n = sc.nextInt()
    var sum:Int = 0

    for (item in 1..n){
        println(item)
        sum += item
    }
    println("sum"+sum)
}