package sec8

/**
 * 6.8.1 匿名函数的用法
 */

fun main(args: Array<String>) {
    var fun1 = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(fun1(2, 4))

    // 匿名函数的函数体是单表达式，可以省略声明函数的返回值类型。
    var fun2 = fun(x: Int, y: Int) = x + y
    println(fun2(2, 4))

    // 使用匿名函数作为参数
    var filteredList1 = listOf(1, 3, 23, 45, 2).filter(
            fun(e): Boolean {
                return e > 20
            }
    )
    println(filteredList1)

    var filteredList2 = listOf(1, 3, 23, 45, 2).filter(
            fun(e): Boolean = e > 20
    )
    println(filteredList2)
}
