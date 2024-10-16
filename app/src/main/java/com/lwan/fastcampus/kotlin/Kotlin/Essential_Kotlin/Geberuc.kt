package com.lwan.fastcampus.kotlin.Kotlin

/**
 * Generic (제너릭)
 *
 * 목적: 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에서 컴파일 시에 타입을 체크해주는 기능
 * -> 즉, 타입을 체크하는 기능
 * 제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 떄문에 사용하는 방법만 숙지
 */

fun main(array: Array<String>) {

    //_ 제너릭을 사용하지 않는 경우, 형변환 필요
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString()

    //_ 제너릭을 사용하는 경우 -> 타입이 안전하다
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2]
}