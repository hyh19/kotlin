package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * 9.2.8 取消协程
 */
fun main(args: Array<String>) = runBlocking {

    // 启动协程
    val job = launch(CommonPool) {
        // 打印 1000 次，每隔 0.5 秒一次。
        repeat(1000) {
            println("$it")
            delay(500L)
        }
    }

    delay(2000L)
    // 取消协程
    val b1 = job.cancel()
    println("job cancel: $b1")

    delay(2000L)
    // 再次取消
    val b2 = job.cancel()
    println("job cancel: $b2")
}