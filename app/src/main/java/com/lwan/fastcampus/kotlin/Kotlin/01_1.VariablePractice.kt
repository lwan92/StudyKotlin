package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Variable & Type
 */

var a = 1 + 2 + 3 + 4 + 5 //_ 연사의 결과값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt() //_ 형변환
var d = b.toFloat() //_ 형변환

var e = "John"
var f = "My name is $e Nice to meet you"

//_ Null -> 존재 하지 않는 상태.
//_ var g : Int = null -> syntax error
var g : Int? = null //_ ?를 붙이면 null 가질 수 있는 타입이 된다.

fun main(args: Array<String>) {
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
}