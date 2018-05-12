package com.easy.kotlin

import java.util.*

/**
 * 7.9.4 匿名 object
 *
 * object 对象表达式可以访问包含它的作用域的变量
 */

fun countCompare() {

    val list = mutableListOf(1, 4, 3, 7, 11, 9, 10, 20)

    var countCompare = 0

    Collections.sort(list, object : Comparator<Int> { // 实现了某个接口的匿名对象

        override fun compare(o1: Int, o2: Int): Int {
            countCompare++ // 访问外部变量
            println("countCompare=$countCompare")
            println(list) // 访问外部变量
            return o1.compareTo(o2)
        }
    })
}

fun main(args: Array<String>) {
    countCompare()
}