package com.example.myapplication

fun main(){
    ARS(1)
    ARS(2)
    ARS(3)
    ARS(4)
    ARS(0)
    ARS("ㅁ")
    ARS(99)
}

fun ARS(num: Any?){
    when(num){
        1 -> println("행정부")
        2 -> println("사업부")
        3 -> println("인사부")
        4 -> println("재정부")
        0 -> println("안내 및 문의")
        is String -> println("Not a String")
        else -> println("unknown! please again")
    }

}
