package com.example.myapplication

fun main(){
    //1. class
    //2. data class

    var cls = HelloClass()  // 함수명() 하면 기본 생성자가 호출된다
    var cls2 = HelloClass(1);
    var person = Person(1, "kwak")

    println("class.age: " + cls.age)
    println("person.age: " + person.age)
}

class HelloClass {
    var age: Int = 0

    init { // 초기값
        age = 0
    }

    constructor() // 기본 생성자
    constructor(age: Int) {// 보조 생성자
        this.age = age
    }
}
data class Person(var age:Int, var name:String)
