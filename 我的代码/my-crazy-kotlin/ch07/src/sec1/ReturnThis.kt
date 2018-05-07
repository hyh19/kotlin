package sec1

/**
 * 7.1.3 对象的 this 引用
 */

class ReturnThis {
    var age = 0
    fun grow(): ReturnThis {
        age++
        return this
    }
}

fun main(args: Array<String>) {
    val result = ReturnThis()
    result.grow().grow().grow()
    println(result.age)
}