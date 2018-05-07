package sec6

/**
 * 8.6.3 伴生对象和静态成员
 */

class MyClass {
    /*companion object MyObject1 : Outputable {
        const val name = "paper"
        override fun output(msg: String) {
            println(msg)
        }
    }*/

    // 伴生对象可省略名字
    companion object : Outputable {
        const val name = "paper"
        override fun output(msg: String) {
            println(msg)
        }
    }
}

// 为伴生对象扩展方法
fun MyClass.Companion.test() {
    println("dog")
}

// 扩展伴生对象的属性
val MyClass.Companion.pet
    get() = "cat"

fun main(args: Array<String>) {
    MyClass.output("banana")
    println(MyClass.name)
    // 伴生对象省略名字时可以用 Companion 代替
    println(MyClass.Companion)

    // 调用扩展的成员
    MyClass.test()
    println(MyClass.pet)
}