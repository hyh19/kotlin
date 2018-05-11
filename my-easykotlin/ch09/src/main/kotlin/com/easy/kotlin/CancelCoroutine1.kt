package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * 9.2.10 计算代码协程的取消方式
 * 方法一 显式检查取消状态 isActive
 */
fun main(args: Array<String>) = runBlocking {

    val job = launch(CommonPool) {
        var nextPrintTime = 0L
        var i = 0
        while (i < 20) {
            // 如果协程处于非活动状态，跳出协程代码块。
            if (!isActive) { // 注意：isActive 是 CoroutineScope 的属性
                return@launch
            }
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

    // 注意输出，如果没有 return@launch，此时循环还在继续打印。

    delay(3000L)
    val b2 = job.cancel()
    println("job cancel: $b2")
}