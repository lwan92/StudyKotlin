package com.lwan.fastcampus.kotlin.Kotlin

import java.util.*

/**
 * ControFlow Practice
 */

fun main(args: Array<String>) {
    val value: Int? = null //_ null 을 가질 수 있는 변수

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    when (value2) {
        true -> {
            println("true")
        }

        false -> {
            println("false")
        }

        null -> {
            println("value2 is null")
        }
    }

    val value3 = when(value2) {
        true -> 1
        false -> 2
        else -> 3
    }

    println("value3: $value3")

    //_ when 의 다양한 조건식 (1), is
    val value4: Any = "hello"
    when (value4) {
        is Int -> {
            println("value4 is Int")
        }

        is String -> {
            println("value4 is String")
        }

        else -> {
            println("value4 is not Int")
        }
    }

    //_ when 의 다양한 조건식 (2)
    val value5: Int = 80
    when (value5) {
        in 60..70 -> {
            println("value5 is 60..70")
        }

        in 70..80 -> {
            println("value5 is 70..80")
        }

        in 80..90 -> {
            println("value5 is 80..90")
        }

        else -> {
            println("value5 is else")
        }
    }
}