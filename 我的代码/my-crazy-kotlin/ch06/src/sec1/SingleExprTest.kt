package sec1

/**
 * 6.1.4 单表达式函数
 */

fun area(x: Double, y: Double): Double = x * y

fun area1(x: Double, y: Double) = x * y // 省略返回值类型

fun main(args: Array<String>) {
    println(area(5.0, 10.0))
    println(area1(4.0, 8.0))
}