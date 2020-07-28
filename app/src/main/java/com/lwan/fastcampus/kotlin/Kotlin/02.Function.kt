package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Function -> 함수
 * input에 따라 output 출력
 *
 * 사용법
 * fun functionName ( VariableName : type, VariableName : type ... ) : returnType {
 * function contents
 * return returnValue
 * }
 */

/**
 * 기본 함수
 */
fun plus(first: Int, second: Int): Int {
    println("plus() call | first: $first | second: $second")
    val result: Int = first + second

    return result
}

/**
 * 간단한 함수를 선언하는 방법
 * plus 함수와 같은 결과를 return 한다.
 */
fun plusShort(first: Int, second: Int) = first + second

/**
 * 디폴트 값을 갖는 함수
 */
fun defaultPlus(first: Int, second: Int = 5): Int {
    println("defaultPlus() call | first: $first | second: $second")
    val result: Int = first + second

    return result
}

/**
 * 반환 값이 없는 함수
 * Unit: 아무것도 리턴하지 않음, 생략 가능함
 */
fun noReturn(first: Int, second: Int): Unit {
    println("defaultPlus() call | first: $first | second: $second")
    val result: Int = first + second

    println(result)
}

/**
 * 가변 인자를 갖는 함수
 * vargarg 는 1~n 개의 인자를 받을 수 있음.
 */
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

/**
 * 내부 함수
 */
fun innerPlus(first: Int, second: Int): Int {

    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    return plus(first, second)
}

fun main(args: Array<String>) {
    //_ 기본 함수
    val result = plus(5, 3)
    println(result)

    //_ 간단한 함수
    val shortResult = plusShort(5, 3)
    println(shortResult)

    //_ 인수를 명시적으로 넣어 전달 하는 방
    val result2 = plus(first = 10, second = 14)
    println(result2)
    val result3 = plus(second = 10, first = 14)
    println(result3)

    //_ default value를 가진 함수 사용
    val defaultResult = defaultPlus(5, 10)
    println(defaultResult)
    val defaultResult2 = defaultPlus(5)
    println(defaultResult2)

    //_ 반환값이 없는 함수법
    noReturn(10, 15)

    //_ 가변인자를 갖는 함수
    plusMany(1, 2, 3, 4, 5)
}
