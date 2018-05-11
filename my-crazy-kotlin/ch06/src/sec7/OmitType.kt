package sec7

/**
 * 6.7.2 利用上下文推断类型
 */

fun main(args: Array<String>) {
    // 根据变量声明可以推断出 Lambda 表达式的形参类型
    var square: (Int) -> Int = { n -> n * n }
    println(square(5))

    var list = listOf("Java", "Kotlin", "Go")
    // 根据 dropWhile 的方法签名可以推断出 Lambda 表达式的形参类型
    var result1 = list.dropWhile { e -> e.length > 3 }
    println(result1)

    // 变量没有声明类型，无法推断 Lambda 表达式的形参类型。
    var result2 = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(4, 3)
    println(result2)
}