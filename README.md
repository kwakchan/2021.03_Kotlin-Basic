# 2021.03_Kotlin-Basic

⑴ varidation declaration
1. val&var
-val: varidation never change.
-var: varidation can change.

2. variable of type
types: Byte, Short, Long, Float, Double, String
var count: Int = 10
count = 15

3. type Method 
val laguageName ="kotlin"
val StringMethod = languageName.toUpperCase()   //String method can be used
val IntMethod = laguageName.inc() // Int method can`t be used

4. Null safety
Kotlin variables(String) can't hold null values by default .
"String?" can assing either a String or null. 
-val language: String = null (x)
-val language: String? = null (o)

5. Encapsulation
class Person(
    val name: String, // read only: getter
    var age: Int        // both read and write: getter & setter
)
// 필드는 자동으로 private 설정

⑵ condutuinals

1. condutuinals type
ⓐif-else type
if (count == 42) {
    println("I have the answer.")
} else if (count > 35) {
    println("The answer is close.")
} else {
    println("The answer eludes me.")
}
println(answerString)

ⓑ when-arrow type
val answerString = when {
    count == 42 -> "I have the answer."
    count > 35 -> "The answer is close."
    else -> "The answer eludes me."
}
println(answerString)

2. smart casting; safe call(?.) & non-null(!!.) & if-else include null
    var str1 : String? = null
   ①println("str1: $str1 lenghth: ${str1.length}") (x)
   ②println("str1: $str1 length: ${str1?.length}") (o) // return: null
   ③println("str1: $str1 length: ${str1!!.length}") (o) // return: NPE(NullPointerException)
   ④val len = if(str1 != null) str1.length 
	      else -1 
      println("str1: ${len}") // return: -1

3. 자료형 변환 메서드
.toByte: Byte
.toLong: Long
.toShort: Short    
.toFloat: Float
.toInt: Int
.toDouble: Double
.toChar: Char

⑶ Functuions

ⓐ non-parameter
fun generateAnswerString(): String {
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }

    return answerString
}
ⓑ parameter 
fun generateAnswerString(countThreshold: Int): String {
    val answerString = if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
    return answerString
}

ⓒ non-return
fun generateAnswerString(countThreshold: Int): String {
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
}

ⓓ non-functionName
// "(String)" is parameter "->Int" is return value
val stringLengthFunc: (String) -> Int = { input ->
    input.length
}

// non-parameter
val stringLength: Int = stringLengthFunc("Android")

ⓔ parameter is funtuion
fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}

⑷ Class
1. 
class Car { // class
    val wheels = listOf<Wheel>() // attribute
}

2.
class Car(val wheels: List<Wheel>)


4.상호운용성
Kotlin의 가장 중요한 기능 중 하나는 자바와의 유연한 상호운용성입니다. 
Kotlin 코드는 JVM 바이트 코드로 컴파일되기 때문에 Kotlin 코드는 자바 코드로 직접 호출될 수 있으며 그 반대의 경우도 마찬가지입니다. 
즉, 기존 자바 라이브러리를 Kotlin에서 직접 활용할 수 있습니다. 또한 대부분의 Android API는 자바로 작성되어 Kotlin에서 바로 호출할 수 있습니다.

-----------------------------------------------------------
