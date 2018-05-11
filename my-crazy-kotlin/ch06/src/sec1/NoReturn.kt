package sec1

/**
 * 6.1.2 函数返回值和Unit
 */

fun foo() {
    println("Hello, world!")
}

fun sayHi(name: String): Unit {
    println("Hello, $name!")
}

fun showMsg(msg: String, count: Int) {
    for (i in 1..count) {
        println(msg)
    }
}

fun main(args: Array<String>) {
    foo()
    sayHi("Ken")
    showMsg("Kotlin", 3)
}