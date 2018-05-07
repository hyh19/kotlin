package sec6

/**
 * 6.6.3 Lambda 表达式的脱离
 */

var lambdaList = java.util.ArrayList<(Int) -> Int>()

fun collectFn(fn: (Int) -> Int) {
    lambdaList.add(fn)
}

fun main(args: Array<String>) {
    collectFn({ it * 2 })
    collectFn({ it * 3 })
    // 尾随闭包
    collectFn { it * it }
    collectFn { it * it * it }

    println(lambdaList.size)
    for (i in lambdaList.indices) {
        println(lambdaList[i](5))
    }
}