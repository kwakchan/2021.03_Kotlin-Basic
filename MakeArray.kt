package com.example.myapplication

fun main(){
    //1. 배열
    var arr1 = listOf("1", "2") // 수정 할 수 없는 배열
    var arr2 = mutableListOf("1", "2") // 수정 할 수 있는 배열

    arr2.add("3") //arr1.add 안됨
    
    //2. 반복문
    for(item in arr1){ //어디서 어떤 인자를 빼올것인지
        println(item)
    }
    
    for((index, item) in arr1.withIndex()){
        println("$index, $item") // index: 배열번호, item: 값
    }
    
    //3. 조건문 + 캐스팅
    var hello: Any = "hello" // Any: String, int, long의 최상위단, auto casting이라 부른다
    if(hello is String){
        var str: String = hello
    }

}
