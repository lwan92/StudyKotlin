package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Operator -> 연산자
 *
 */

fun main() {
    println("arithmetic()")
    arithmetic(20, 3)

    println("\ncompoundAssignment()")
    compoundAssignment(20, 3)

    println("\nincrease()")
    increase(20, 3)

    println("\ncompare()")
    compare(20, 3)

    println("\nlogic()")
    logic(20, 3)
}

/**
 * 산술 연산자
 */
fun arithmetic(first: Int, second: Int) {
    println(first + second)
    println(first - second)
    println(first * second)
    println(first / second)
    println(first % second)
}

/**
 * 복합 대입 연산자
 */
fun compoundAssignment(first: Int, second: Int) {
    var firstIndex = first
    firstIndex += 10

    var secondIndex = second
    secondIndex *= 10

    println(firstIndex)
    println(secondIndex)
}

/**
 * 증감 연산자
 */
fun increase(first: Int, second: Int) {
    var firstIndex = first
    firstIndex++

    var secondIndex = second
    secondIndex--

    println(firstIndex)
    println(secondIndex)
}

/**
 * 비교 연산자
 */
fun compare(first: Int, second: Int) {
    println(first > second)
    println(first >= second)
    println(first == second)
    println(first < second)
    println(first <= second)
}

/**
 * 논리 연산자
 */
fun logic(first: Int, second: Int) {
    var isFirst : Boolean = first > second
    var isSecond : Boolean = first < second

    println(isFirst && isSecond)
    println(isFirst || isSecond)
    println(!isFirst)
}