package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

/**
 * 9.2.2 简单协程示例
 */

fun firstCoroutineDemo0() {
    launch(CommonPool) {
        delay(3000L, TimeUnit.MILLISECONDS)
        println("Hello,")
    }
    println("World!")
    Thread.sleep(5000L)
}

fun main(args: Array<String>) {
    firstCoroutineDemo0()
}