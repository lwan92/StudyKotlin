package com.lwan.fastcampus.kotlin.Kotlin

/**
 * class
 *
 * OOP -> Object Oriented Programing (객체지향 프로그래밍)
 *
 * 객체란?
 * - 이름이 있는 모든 것
 * - 객체를 만들어 일을 시켜서 문제를 해결한다.
 *
 */

fun main(array: Array<String>) {

    //_ 클래스 생성 방법 -> Instance
    val defaultCar: Car = Car("v8 engine", "big")
    defaultCar.info()

    val superCat: SuperCar = SuperCar("good engine", "big", "white")
    superCat.info()

    val doorCar: DoorCar = DoorCar("door engine", "door")
    doorCar.info()
    val doorPinkCar: DoorCar = DoorCar("door engine", "door", "pink")
    doorPinkCar.info()

    //_ 인스턴스의 멤버 변수에 접근 하는 방법
    doorPinkCar.door = "black"
    doorPinkCar.info()
}

//_ 클래스 만드는 방법 (1)
class Car(var engine: String, var body: String) {
    var mEngine: String
    var mBody: String

    fun info() {
        println("engine: $engine | body: $body")
    }

    init {
        mEngine = engine
        mBody = body
    }
}

//_ 클래스 만드는 방법 (2)
class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }

    init {
        //_ 가장 먼저 출력되는 곳
    }

    fun info() {
        println("engine: $engine | body: $body | door: $door")
    }
}

//_ 클래스 만드는 방법 (3) -> (1) 방법의 확장
class DoorCar(var engine: String, var body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String): this(engine, body) {
        this.door = door
    }

    fun info() {
        println("engine: $engine | body: $body | door: $door")
    }
}

//_ 클래스 만드는 방법 (4) -> (2) 방법의 확장, 생성자 여러개 만들기
class DefaultCar {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine= engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

//_ 오버로딩 -> 함수의 이름이 동일할 때 처리하는 방법
class InfoClass() {
    fun info(info: String) {

    }

    fun info(info: String, subInfo: String) {

    }
}