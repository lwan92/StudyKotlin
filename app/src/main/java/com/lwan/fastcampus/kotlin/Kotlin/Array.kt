package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Array -> 배열
 *
 * 배열이 필요한 이유 -> 그룹이 필요 할 떄
 */

fun main(array: Array<String>) {

    //_ 배열 생성 방법(1) -> 타입 지정(1)
    var group1 = arrayOf<Int>(1, 2, 3, 4, 5)

    //_ 배열 생성 방법(2) -> 타입 지정(2)
    var groupInt = intArrayOf(1, 2, 3)
    var groupChar = charArrayOf('b', 'c')
    var groupDouble = doubleArrayOf(1.2, 100.3)
    var groupBoolean = booleanArrayOf(true, false, false)

    //_ 배열 생성 방법(3) -> 타입 미지정, 안에 들어가는 value 가 통일되지 않아도 가능하다
    var group2 = arrayOf(1, 2, 3, 4, 5)
    var group3 = arrayOf(1, 2.3, 3.5f, "hello") //_ 거의 사용하지 않음

    //_ 배열 생성 방법(4) -> lambda 를 활용한 방법
    var groupSize1 = Array(5) { 0 }
    var groupSize2 = Array(5) { 1; 2; 3; 4; 5 }

    //_ 배열의 값을 꺼내는 방법 -> get 과 [] 를 이용
    for (a in group1.indices) {
        println("get : " + group1.get(a))
        println("[]: " + group1[a])
    }

    //_ 배열의 값을 바꾸는 방법(1)
    group1.set(0, 10)
    println(group1[0])

    //_ 배열의 값을 바꾸는 방법(2)
    group1[0] = 20
    println(group1[0])
}
