package sec6

/**
 * 8.6.1 对象表达式
 */

interface Outputable {
    fun output(msg: String)
}

abstract class Product(var price: Double) {
    abstract val name: String
    abstract fun printInfo()
}

fun main(args: Array<String>) {
    // 指定一个父类型（接口）的对象表达式
    val obj1 = object : Outputable {
        override fun output(msg: String) {
            println(msg)
        }
    }
    obj1.output("dog")

    // 指定零个父类型的对象表达式
    val obj2 = object {
        // 初始化块
        init {
            println("初始化块")
        }

        // 属性
        var name = "Kotlin"

        // 方法
        fun test() {
            println("apple")
        }

        // 只能包含内部类，不能包含嵌套类。
        inner class Foo
    }
    println(obj2.name)
    obj2.test()

    // 指定两个父类型的对象表达式
    // 由于 Product 只有一个带参数的构造器，因此需要传入构造器参数。
    val obj3 = object : Outputable, Product(28.8) {
        override fun output(msg: String) {
            println(msg)
        }

        override val name: String
            get() = "iPhone 7"

        override fun printInfo() {
            println("iPhone 7, Black")
        }
    }
    println(obj3.name)
    obj3.output("tiger")
    obj3.printInfo()
}