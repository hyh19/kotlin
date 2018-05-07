package sec6

/**
 * 6.6.2 使用 Lambda 表达式代替局部函数
 */

fun getMathFunc(type: String): (Int) -> Int {

    when (type) {
        "square" -> return { n: Int ->
            n * n
        }
        "cube" -> return { n: Int ->
            n * n * n
        }
        else -> return { n: Int ->
            var result = 1
            for (index in 2..n) {
                result *= index
            }
            result
        }
    }
}

fun main(args: Array<String>) {
    var mathFunc = getMathFunc("square")
    println(mathFunc(5))
    mathFunc = getMathFunc("cube")
    println(mathFunc(5))
    mathFunc = getMathFunc("other")
    println(mathFunc(5))
}
