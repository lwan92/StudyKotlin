package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Iterable -> 반복문
 */

fun main(array: Array<String>) {

    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6 ,7, 8, 9)

    //_ 반복하는 방법 (1)
    for (item in a) {
//        println(item)
    }

    //_ 반복하는 방법 (2) index를 조건에 넣어서 사용하고 싶을 떄
    for ((index, item) in a.withIndex()) {
//        println("index : $index | value: $item")
    }

    //_ 반복하는 방법 (3) -> lambda 문법
    a.forEach {
//        println(it)
    }

    //_ 반복하는 방법 (4) -> lambda 문법 & parameter 변경
    a.forEach { item ->
//        println(item)
    }

    //_ 반복하는 방법 (5) -> lambda 문법
    a.forEachIndexed { index, i ->
//        println("index $index | value: $i")
    }

    //_ 반복하는 방법 (6) -> a until b(작은수에서 큰수), a ~ b - 1 까지 반복
    for (i in 0 until a.size) {
//        println(a[i])
    }

    //_ 반복하는 방법 (7) -> a until b step c, a ~ b -1 까지 c씩 증가하면서 반복
    for (i in 0 until a.size step 2) {
//        println(a[i])
    }

    //_ 반복하는 방법 (8) -> a downTo b(큰수에서 작은수), a 부터 b까지 반복
    for (i in a.size - 1 downTo 0) {
//        println(a[i])
    }

    //_ 반복하는 방법 (9) -> a downTo b step c, a 부터 b까지 c씩 감소하면서 반복
    for (i in a.size - 1 downTo 0 step 2) {
//        println(a[i])
    }

    //_ 반복하는 방법 (10) a .. b, a부터 b까지 반복
    for (i in 0 .. a.size - 1) {
//        println(a[i])
    }

    //_ 반복하는 방법 (11)
    var b: Int = 0
    var c: Int = 4

    while (b < c) {
//        println(b)
//        b++
    }

    //_ 반복하는 방법 (12), 조건이 만족하지 않더라도 do안에 있는 코드는 1번 실행된다.
    do {
        println("hello")
    } while (b < c)
}