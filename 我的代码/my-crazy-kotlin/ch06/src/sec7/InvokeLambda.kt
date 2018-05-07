package sec7

/**
 * 6.7.1 调用 Lambda 表达式
 */

fun main(args: Array<String>) {
    var square = { n: Int ->
        n * n
    }
    println(square(5))

    // 直接调用 Lambda 表达式
    var result = { base: Int, exponent: Int ->
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        result
    }(2, 4)
    println(result)
}