package sec2

/**
 * 6.2.1 命名参数
 */

fun girth(width: Double, height: Double) = 2 * (width + height)

fun main(args: Array<String>) {
    println(girth(3.5, 4.8))
    println(girth(width = 3.5, height = 4.8))
    println(girth(height = 4.8, width = 3.5))
    println(girth(3.5, height = 4.8))
    // 位置参数必须放在命名参数之前
    // println(girth(width = 3.5, 4.8)) // Mixing named and positioned arguments is not allowed
}