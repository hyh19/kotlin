package sec6

/**
 * 8.6.2 对象声明和单例模式
 */

object MyObject1 : Outputable {
    override fun output(msg: String) {
        println(msg)
    }
}

object MyObject2 {
    // 初始化块
    init {
        println("初始化块")
    }

    // 属性
    var name = "Kotlin"

    // 方法
    fun test() {
        println("computer")
    }

    // 只能包含嵌套类，不能包含内部类
    class Foo
}

object MyObject3 : Outputable, Product(28.8) {
    override fun output(msg: String) {
        println("book")
    }

    override val name: String
        get() = "iPhone X"

    override fun printInfo() {
        println("iPhone X, Black")
    }
}

fun main(args: Array<String>) {
    MyObject1.output("doctor")

    println(MyObject2.name)
    MyObject2.test()

    MyObject3.output("rice")
    MyObject3.printInfo()
}