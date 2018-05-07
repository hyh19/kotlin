package sec1

/**
 * 7.1.3 对象的 this 引用
 */
class Dog {
    fun jump() {
        println("jump")
    }

    fun run() {
        this.jump()
        println("run")
    }
}

fun main(args: Array<String>) {
    var dog = Dog()
    dog.run()
}