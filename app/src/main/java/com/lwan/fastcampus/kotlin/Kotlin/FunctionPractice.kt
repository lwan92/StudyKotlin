package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Function Practice
 */

fun main() {
    val plus = plusThree(first = 1, second = 2, third = 3)
    println("plus:  $plus")

    val minus = minusThree(10,2,3)
    println("minus: $minus")

    val multiply = multiplyThree(2,3,4)
    println("multiply: $multiply")

    val defaultMultiply = multiplyThree()
    println("defaultMultiply: $defaultMultiply")

}

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {

    return first * second * third
}