package sec10

/**
 * 6.10.3 非局部返回
 */

inline fun each(data: Array<Int>, fn: (Int) -> Unit) {
    for (e in data) {
        fn(e)
    }
}

// 函数 each 添加了 inline 修饰符后等价于下面的代码
fun each1(data: Array<Int>) {
    for (e in data) {
        println(e)
        return
    }
}

fun main(args: Array<String>) {
    var arr = arrayOf(20, 4, 40, 100, 30)
    each(arr, {
        println(it)
        return
    })
}