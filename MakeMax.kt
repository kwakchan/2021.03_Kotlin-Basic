package com.example.myapplication

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val num3 = sc.nextInt()
    val num4 = sc.nextInt()
    val num5 = sc.nextInt()
    val num6 = sc.nextInt()
    val num7 = sc.nextInt()
    val num8 = sc.nextInt()
    val num9 = sc.nextInt()
    val list = listOf<Int>(num1, num2, num3, num4, num5, num6, num7, num8, num9)

    var max:Int = 0
    var index:Int = 1

    for(item in list) {
        if (item>max){
            max = item
            index++
        }
    }
    println(max)
    println(index)

}