package sec1

/**
 * 6.1.1 定义和调用函数
 */

fun max(x: Int, y: Int): Int {
    val z = if (x > y) x else y
    return z
}

// 返回一个表达式
fun max1(x: Int, y: Int): Int {
    return if (x > y) x else y
}

fun sayHi(name: String): String {
    return "Hello, ${name}!"
}

fun main(args: Array<String>) {
    var a = 6
    var b = 9
    var result = max(a, b)
    println("max: ${result}")

    result = max1(a, b)
    println("max1: ${result}")

    println(sayHi("John"))
}