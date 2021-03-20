package com.example.myapplication

fun main(){
    val dog1: Dog = yorkshire()
    dog1.sayHello()

    val dog2: Dog = Dog()
    dog2.sayHello()
}


open class Dog{ // open = public
    open fun sayHello(){
        println("wow wow")
    }
}

class yorkshire: Dog(){
    override fun sayHello(){
        println("wif wif")
    }
}

