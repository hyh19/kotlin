package com.easy.kotlin

/**
 * 7.9.4 匿名 object
 */

fun distance(x: Double, y: Double): Double {
    val origin = object {
        var x = 0.0
        var y = 0.0
    }
    return Math.sqrt((x - origin.x) * (x - origin.x) + (y - origin.y) * (y - origin.y))
}

fun main(args: Array<String>) {
    println(distance(3.0, 4.0))
}