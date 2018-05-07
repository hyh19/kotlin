package sec5

/**
 * 6.5.1 使用函数类型
 */

fun main(args: Array<String>) {

    var myFun: (Int, Int) -> Int

    fun pow(base: Int, exponent: Int): Int {
        var result = 1
        for (i in 1..exponent) {
            result *= base
        }
        return result
    }

    myFun = ::pow
    println(myFun(3, 4)) // 81

    fun area(width: Int, height: Int): Int {
        return width * height
    }

    myFun = ::area
    println(myFun(3, 4)) // 12
}