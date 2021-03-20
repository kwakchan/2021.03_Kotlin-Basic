package com.example.myapplication

fun main(){
    // 1. map => key, value

    var map1 = mapOf(Pair("naem", "xhan"))

    var map2 = mutableMapOf<String, String>()
    map2.put("name", "xhan")
    map2.put("age", "26")

    for(map in map2){
        println(map)
        println(map.key)
        println(map.value)
    }

}
