package sec3

/**
 * 6.3 函数重载
 */

fun test() {
    println("test 1")
}

fun test(msg: String) {
    println(msg)
}

fun test(num: Int): String {
    println(num)
    return "test 3"
}

fun main(args: Array<String>) {
    test()
    test("Hello World")
    var result = test(30)
    println(result)
}