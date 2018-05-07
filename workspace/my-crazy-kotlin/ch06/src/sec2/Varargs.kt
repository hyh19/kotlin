package sec2

/**
 * 6.2.4 个数可变的形参
 */

fun test(num: Int, vararg books: String) {
    println(num)
    for (b in books) {
        println(b)
    }
}

fun test1(vararg books: String, num: Int) {
    println(num)
    for (b in books) {
        println(b)
    }
}

fun main(args: Array<String>) {
    test(5, "疯狂iOS讲义", "疯狂Android讲义")

    test1("疯狂iOS讲义", "疯狂Android讲义", num = 20)

    var arr = arrayOf("疯狂Kotlin讲义", "疯狂Java讲义")
    test1(*arr, num = 20)
}