package sec6

/**
 * 8.6.1 对象表达式可访问或修改其作用域内的局部变量
 */

fun main(args: Array<String>) {
    var a = 20
    val obj = object {
        fun change() {
            a++
        }
    }
    obj.change()
    println(a)
}