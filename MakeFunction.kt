package com.example.myapplication

fun main(){ // 시작주기
    val hello1: String = "hello world" // final
    var hello2: String // int, string, float, double
    var hello3: String? // ?가 없으면 null값을 절대 허락하지 않는다

    //hello1 = "123" //x
    hello2 = "123" //ㅇ

    hello() // 아래 함수를 호출한다

    print(hello1)
    println(hello1)
    println(hello())
}

fun hello(): String{ // 반환형
    return "hello kotlin"
}