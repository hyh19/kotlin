package sec5

/**
 * 6.5.3 使用函数类型作为返回值类型
 */

fun getMathFunc(type: String): (Int) -> Int {

    fun square(n: Int): Int {
        return n * n
    }

    fun cube(n: Int): Int {
        return n * n * n
    }

    fun factorial(n: Int): Int {
        var result = 1
        for (index in 2..n) {
            result *= index
        }
        return result
    }

    when (type) {
        "square" -> return ::square
        "cube" -> return ::cube
        else -> return ::factorial
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
