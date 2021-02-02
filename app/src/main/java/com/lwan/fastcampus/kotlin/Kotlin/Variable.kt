package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Variable -> 변수
 * var(variable): 내 마음대로 원하는 것을 넣을 수 있음.
 * val(Value): 한번 넣으면 바꿀 수 없음.
 */

var num = 10
var hello = "hello"
var point : Float = 3.4f
var double : Double = 10.4

val fix = 20 //_ val 은 값을 바꿀 수 없음. 처음 값을 그대로 유지.

fun main(args:Array<String>) {
    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Buy"
    point = 10.4f

    println(num)
    println(hello)
    println(point)
    println(fix)
}