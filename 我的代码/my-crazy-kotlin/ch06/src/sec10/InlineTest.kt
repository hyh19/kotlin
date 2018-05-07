package sec10

/**
 * 6.10.1 内联函数的使用
 */

inline fun map(data: Array<Int>, fn: (Int) -> Int): Array<Int> {
    var result = Array<Int>(data.size, { 0 })
    for (i in data.indices) {
        result[i] = fn(data[i])
    }
    return result
}

fun main(args: Array<String>) {
    var arr = arrayOf(10, 20, 30, 40, 50)
    var mappedResult = map(arr, { it + 3 })
    println(mappedResult.contentToString())
}
