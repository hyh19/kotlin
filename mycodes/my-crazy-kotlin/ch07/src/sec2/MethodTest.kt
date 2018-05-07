package sec2

/**
 * 7.2.1 方法与函数的关系
 */

class Dog {
    fun run() {
        println("run")
    }

    fun eat(food: String) {
        println("eat: $food")
    }
}

fun main(args: Array<String>) {
    val dog = Dog()
    // 在类中定义的方法可独立出来成为一个函数
    val run: (Dog) -> Unit = Dog::run
    val eat: (Dog, String) -> Unit = Dog::eat
    run(dog)
    eat(dog, "apple")
}