package sec4

/**
 * 6.4 局部函数
 */

fun getMathFunc(type: String, num: Int): Int {

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
        "square" -> return square(num)
        "cube" -> return cube(num)
        else -> return factorial(num)
    }
}

fun main(args: Array<String>) {
    println(getMathFunc("square", 3))
    println(getMathFunc("cube", 3))
    println(getMathFunc("", 3))
}
