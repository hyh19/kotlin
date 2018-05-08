package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.run
import java.util.concurrent.TimeUnit

/**
 * 9.2.5 挂起函数
 */

suspend fun runCoroutineDemo() {
    run(CommonPool) {
        delay(3000L, TimeUnit.MILLISECONDS)
        println("suspend,")
    }
    println("runCoroutineDemo!")
    Thread.sleep(5000L)
}

fun callSuspendFun() {
    // 启动一个协程
    launch(CommonPool) {
        runCoroutineDemo()
    }
    // 不要让主线程那么快结束
    Thread.sleep(10000L)
}

fun main(args: Array<String>) {
    callSuspendFun()
}