package com.lwan.fastcampus.kotlin.Kotlin

/**
 * ControlFlow(제어흐름)
 * - if, else, when
 */

fun main(args: Array<String>) {
    controlFlowFirst()
    controlFlowSecond()
}

fun controlFlowFirst() {
    var a: Int = 5
    var b: Int = 10

    //_ if/else 사용법
    if (a > b) {
        println("a가 b보다 크다")
    } else {
        println("a가 b보다 작다")
    }

    //_ if/elseif/else 사용법
    if (a > b) {
        println("a가 b보다 크다")
    } else if (a < b) {
        println("a가 b보다 작다")
    } else {
        println("a와 b는 같다")
    }

    //_ 값을 리턴하는 if 사용법1
    var max = if (a > b) {
        a
    } else {
        b
    }

    //_ 값을 리턴하는 if 사용법2
    var max2 = if (a > b) a else b

    println()
    println(max)
    println(max2)

    //_ 엘비스 연산자(?:) -> null 체크
//   val number: Int? = 100
    val number: Int? = null
    val number2 = number ?: 10

    println()
    println(number2)
}

fun controlFlowSecond() {
    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }

        2 -> {
            println("value is 2")
        }

        3 -> {
            println("value is 3")
        }

        else -> {
            println("value is else")
        }
    }

    //_ 값을 리턴하는 when 사용법
    val value2 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }

    println("value2: $value2")
}