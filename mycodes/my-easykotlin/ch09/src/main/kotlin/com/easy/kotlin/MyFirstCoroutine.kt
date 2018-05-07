package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import java.util.concurrent.TimeUnit

/**
 * Created by yuhuihuang on 2018/5/7.
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