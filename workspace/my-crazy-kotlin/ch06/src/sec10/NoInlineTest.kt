package sec10

/**
 * 6.10.2 部分禁止内联
 */

inline fun test(fn1: (Int) -> Int, noinline fn2: (String) -> String) {
    println(fn1(20))
    println(fn2("Kotlin"))
}

fun main(args: Array<String>) {
    test({ it * it }, { "Hello $it" })
}