package sec9

/**
 * 6.9 捕获上下文中的变量和常量
 */

fun makeList(e: String): () -> List<String> {
    var list: MutableList<String> = mutableListOf()
    fun addElement(): List<String> {
        // 可以访问宿主函数的变量（副本）和参数
        list.add(e)
        return list
    }
    return ::addElement
}

fun main(args: Array<String>) {
    // add1 和 add2 各自持有 list 的副本
    val add1 = makeList("Hello")
    println(add1())
    println(add1())
    val add2 = makeList("Kotlin")
    println(add2())
    println(add2())
}