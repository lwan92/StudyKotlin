package com.lwan.fastcampus.kotlin.Kotlin

/**
 * 상속
 */

fun main(args: Array<String>) {
    val superCar1: SuperCar1 = SuperCar1()
    superCar1.drive()
    superCar1.stop()

    val bus: Bus = Bus()
    bus.drive()
}

open class ParentCar() {
    //_ class 생성자의 기본은 private. 다른곳에서 상속을 받으려면 "open" 을 사용해야 함.
    open fun drive(): String {
        return "달린다"
    }

    open fun stop() {

    }
}

class SuperCar1() : ParentCar() {
    override fun drive(): String {
        //_ 부모의 함수를 받아 직접 수정해서 사용 가능.
        val run = super.drive()
        return "발리 $run"
    }

    override fun stop() {
        //_ 부모의 기능을 그대로 사용 할 수 있음
        super.stop()
    }
}

class Bus() : ParentCar() {

}