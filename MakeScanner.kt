package com.example.myapplication

import java.util.*

fun main(args: Array<String>){
    val sc : Scanner = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    if(a>b){
        println('>')
    } else if(a<b){
        println('<')
    } else{
        println("==")
    }
}