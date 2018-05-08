package com.easy.kotlin

import kotlinx.coroutines.experimental.*

/**
 * 9.2.10 计算代码协程的取消方式
 * 方法二 循环调用一个挂起函数 yield()
 */
fun main(args: Array<String>) = runBlocking {

    val job = launch(CommonPool) {
        var nextPrintTime = 0L
        var i = 0
        while (i < 20) {
            yield()
            val currentTime = System.currentTimeMillis()
            if (currentTime >= nextPrintTime) {
                println("${i++}")
                nextPrintTime = currentTime + 500L
            }
        }
    }

    delay(3000L)
    val b1 = job.cancel()
    println("job cancel: $b1")

    delay(3000L)
    val b2 = job.cancel()
    println("job cancel: $b2")
}