package sec7

/**
 * 6.7.4 调用 Lambda 表达式的约定
 */

fun main(args: Array<String>) {
    var list = listOf("Java", "Kotlin", "Go")
    var result1 = list.dropWhile({ it.length > 3 })
    // 最后一个参数是 Lambda 表达式，可将表达式写在括号外面。
    var result2 = list.dropWhile { it.length > 3 }
    println(result1)
    println(result2)
}