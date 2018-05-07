package sec5

/**
 * 6.5.2 使用函数类型作为形参类型
 */

fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size, { 0 })
    for (i in data.indices) {
        result[i] = fn(data[i])
    }
    return result
}

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

fun main(args: Array<String>) {
    var data = arrayOf(1, 2, 3, 4, 5)
    println("original: ${data.contentToString()}")
    println("square: ${map(data, ::square).contentToString()}")
    println("cube: ${map(data, ::cube).contentToString()}")
    println("factorial: ${map(data, ::factorial).contentToString()}")
}