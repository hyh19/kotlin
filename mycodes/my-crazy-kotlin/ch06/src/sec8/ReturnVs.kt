package sec8

/**
 * 6.8.2 匿名函数和 Lambda 表达式的 return
 */

fun test(fn: (Int) -> Unit) {
    fn(10)
}

fun main(args: Array<String>) {
    var list = listOf(3, 4, 45, 23)
    list.forEach(fun(n) {
        print("$n ")
        return // 匿名函数中的 return 返回该函数本身
    })

    list.forEach {
        println("$it ")
        return // Lambda 表达式中的 return 返回它所在的 main 函数（设想把 Lambda 表达式赋值给一个变量，该变量所在的函数就是 main 函数。）
    }

    test {
        println(it)
        // Lambda 表达式一般不允许使用 return，除非用在内联函数中，上面的 forEach 方法就是一个内联函数。
        // return
    }

    list.forEach {
        print("$it ")
        return@forEach // 限定返回
    }
}