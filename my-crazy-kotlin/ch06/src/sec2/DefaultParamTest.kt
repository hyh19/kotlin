package sec2

/**
 * 6.2.2 形参默认值
 */

fun sayHi(name: String = "John", message: String = "Welcome!") {
    println("Hi, $name!")
    println("Message: $message")
}

fun main(args: Array<String>) {
    sayHi()
    sayHi("Ken")
    sayHi("Mike", "Welcome to Beijing!")
    sayHi(message = "Welcome to Guangzhou!")

    // sayHi("Welcome to Shenzhen!", name = "Jim") // An argument is already passed for this parameter
}