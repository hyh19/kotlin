package sec1

/**
 * 7.1.1 定义类
 */
class Person {
    var name: String = ""
    var age: Int = 0

    fun say(content: String) {
        println(content)
    }
}

/**
 * 7.1.2 对象的产生和使用
 */

fun main(args: Array<String>) {
    var p = Person()
    p.name = "John"
    p.age = 20
    println(p.name)
    println(p.age)
    p.say("Hi!")
}