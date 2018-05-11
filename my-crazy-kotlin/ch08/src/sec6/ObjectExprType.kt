package sec6

/**
 * 8.6.1 对象表达式的两种类型
 */
class ObjectExprType {

    private val obj1 = object {
        val name: String = "banana"
    }

    internal val obj2 = object {
        val name: String = "computer"
    }

    private fun privateBar() = object {
        val name: String = "cat"
    }

    fun publicBar() = object {
        val name: String = "pig"
    }

    fun test() {

        // obj1 是 private 对象表达式，编译器可识别它的真实类型。
        println(obj1.name)

        // obj2 是非 private 对象表达式，编译器当它是 Any 类型。
        // println(obj2.name) // Error:(28, 16) Kotlin: Unresolved reference: name

        // privateBar 是 private 函数，编译器可识别它返回的对象表达式的真实类型。
        println(privateBar().name)

        // publicBar 是非 private 函数，编译器将它返回的对象表达式当成 Any 类型。
        // println(publicBar().name) // Error:(35, 23) Kotlin: Unresolved reference: name
    }
}

fun main(args: Array<String>) {
    ObjectExprType().test()
}