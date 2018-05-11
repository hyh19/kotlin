package sec2

/**
 * 7.2.2 中缀表示法
 */

class Apple(var weight: Double) {
    override fun toString(): String {
        return "Apple(weight=$weight)"
    }

    // 像二目运算符一样调用该方法
    infix fun add(other: Apple): Double {
        return this.weight + other.weight
    }
}

fun main(args: Array<String>) {
    val apple = Apple(3.4)
    val result = apple add Apple(1.6)
    println(result)
}