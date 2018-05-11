package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.run
import java.util.concurrent.TimeUnit

/**
 * 9.2.5 挂起函数
 */

suspend fun suspendFun() {
    run(CommonPool) {
        delay(3000L, TimeUnit.MILLISECONDS)
        println("apple")
    }
    Thread.sleep(5000L)
    println("banana")
}

fun callSuspendFun() {
    // 启动一个协程
    launch(CommonPool) {
        suspendFun()
    }
    // 不要让主线程那么快结束
    Thread.sleep(10000L)
}

fun main(args: Array<String>) {
    callSuspendFun()
}