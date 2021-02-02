package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Collection
 * -> list, set, map
 */

fun main(array: Array<String>) {

    //_ Immutable Collection -> 변경이 불가능한 Collection
    //_ List -> 중복을 허용 / 순서가 있음
    val numberList = listOf<Int>(1, 2, 3, 3) //_ Int 만 담을 수 있는 list
    println(numberList)
    println(numberList[0])
    println(numberList.get(0))

    //_ Set -> 집합. 즉, 중복을 허용하지 않음 / 순서가 없음
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach { println(it) }

    //_ Map -> key, value 방식으로 관리
    val numberMap = mapOf<String, Int>("one" to 10, "two" to 20)
    println(numberMap["one"])
    println(numberMap.get("one"))

    //_ Mutable Collection -> 변경이 불가능한 Collection
    //_ List
    val mNumberList = mutableListOf<Int>(1, 2, 3)
    mNumberList.add(5)
    mNumberList.add(2, 5)
    mNumberList[0] = 10
    mNumberList.set(1, 20)

    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(4, 5, 6)
    mNumberSet.add(7)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap["put1"] = 10
    mNumberMap.put("put2", 20)
    println(mNumberMap)

    mNumberMap.replace("put1", 30)

    println(mNumberMap.keys)
    println(mNumberMap.values)

    mNumberMap.clear()
    println(mNumberMap)

}