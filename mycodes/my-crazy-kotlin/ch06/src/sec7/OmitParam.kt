package sec7

/**
 * 6.7.3 省略形参名
 */

fun main(args: Array<String>) {
    var square: (Int) -> Int = { it * it }
    println(square(5))

    var list = listOf("Java", "Kotlin", "Go")
    var result1 = list.dropWhile { it.length > 3 }
    println(result1)
}