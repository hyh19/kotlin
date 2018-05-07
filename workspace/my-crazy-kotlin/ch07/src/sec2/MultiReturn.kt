package sec2

/**
 * 7.2.4 数据类和返回多个值的函数
 */

// 数据类会自动为每个属性定义对应的 componentN 方法
data class Result(val code: Int, val desc: String)

// 通过数据类实现返回多个值的函数
fun test() = Result(1, "Success")

fun main(args: Array<String>) {
    var (code, desc) = test()
    println("$code $desc")
}