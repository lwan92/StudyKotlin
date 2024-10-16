package com.lwan.fastcampus.kotlin.Kotlin

/**
 * 인터페이스
 *
 * 인터페이스는 하나의 약속!
 * 생정사가 없다 -> 인스턴스화 시킬 수 없다
 * 반드시 인터페이스에 있는 기능을 구현해야 한다.
 * 구현이 있는 함수를 만들 수 있다
 * 구현이 있는 함수는 인터페이스를 상속받더라도 구현 할 필요가 없다.
*/

fun main(array: Array<String>) {
    val student: Student = Student()
    student.eat()

    val teacher: Teacher = Teacher()
    teacher.eat()
}

interface PersonInterface {
    fun eat() {
        println("먹는다")
    }

    fun sleep()

    abstract fun study()
}

class Student() : PersonInterface {
    override fun eat() {
        println("헉샹이 먹는다")
    }

    override fun sleep() {

    }

    override fun study() {

    }
}

class Teacher() : PersonInterface {
    override fun sleep() {

    }

    override fun study() {

    }

}