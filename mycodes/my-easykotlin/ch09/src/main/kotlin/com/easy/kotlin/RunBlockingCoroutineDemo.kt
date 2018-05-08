package com.easy.kotlin

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * 9.2.6 runBlocking 函数
 */

fun main(args: Array<String>) = runBlocking {
    println("T0")
    launch(CommonPool) {
        println("T1")
        delay(3000L)
        println("T2 Hello,")
    }
    println("T3 World!")
    delay(5000L)
    println("T4")
}