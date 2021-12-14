package com.lwan.fastcampus.kotlin.Kotlin

/**
 * 접근 제어자
 * private, public, protected
 */

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")
    testAccess.test()
    println(testAccess.name)
    testAccess.name = "아무개 투"
    println(testAccess.name)

    val reward: Reward = Reward()
    println(reward.showReward())
    reward.changeReward(2000)
    println(reward.showReward())
}

class TestAccess {
    var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println("테스트")
    }
}

class Reward {
    private var rewardAmount: Int = 1000

    fun changeReward(reward: Int) {
        rewardAmount = reward
    }

    fun showReward() {
        println(rewardAmount)
    }
}