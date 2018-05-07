package sec7

/**
 * 6.7.5 个数可变的参数和 Lambda 参数
 */

fun <T> test(vararg names: String, transform: (String) -> T): List<T> {
    var mutableList: MutableList<T> = mutableListOf()
    for (name in names) {
        mutableList.add(transform(name))
    }
    return mutableList.toList()
}

fun main(args: Array<String>) {
    var list1 = test("Java", "Kotlin", "Go") { it.length }
    println(list1)

    var list2 = test("Java", "Kotlin", "Go") { "Hello $it" }
    println(list2)
}