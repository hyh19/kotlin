package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * 9.2.7 等待一个协程任务执行完毕
 */

class JoinCoroutineDemo {

    private suspend fun fc1() {
        println("[C1 Output] Thread: ${Thread.currentThread()}")
        delay(3000L)
        println("[C1 Output] 3000 End")
    }

    private suspend fun fc2() {
        println("[C2 Output] Thread: ${Thread.currentThread()}")
        delay(5000L)
        println("[C2 Output] 5000 End")
    }

    fun testJoinCoroutine() = runBlocking {

        println("[Main Output] Main Thread: ${Thread.currentThread()}")

        val c1 = launch(CommonPool) {
            fc1()
        }

        val c2 = launch(CommonPool) {
            fc2()
        }

        // 加入到主线程的时间顺序
        c1.join()
        c2.join()

        println("[Main Output] c1 isActive: ${c1.isActive}  isCompleted: ${c1.isCompleted}")
        println("[Main Output] c2 isActive: ${c2.isActive}  isCompleted: ${c2.isCompleted}")
    }
}

fun main(args: Array<String>) {
    val jcd = JoinCoroutineDemo()
    jcd.testJoinCoroutine()
}