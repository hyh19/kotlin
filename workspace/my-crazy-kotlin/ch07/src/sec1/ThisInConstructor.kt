package sec1

/**
 * 7.1.3 对象的 this 引用
 */

class ThisInConstructor {
    var foo: Int

    constructor() {
        val foo = 0
        this.foo = 6
    }
}

fun main(args: Array<String>) {
    println(ThisInConstructor().foo)
}