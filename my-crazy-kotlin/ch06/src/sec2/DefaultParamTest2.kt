package sec2

/**
 * 6.2.2 形参默认值
 */

// 定义一个打印三角形的函数
fun printTriangle(height: Int = 5, char: Char) {
    for (i in 1..height) {
        // 先打印一排空格
        for (j in 0 until height - i) {
            print(" ");
        }
        // 再打印一排特殊字符
        for (j in 0 until 2 * i - 1) {
            print(char);
        }
        println()
    }
}

fun main(args: Array<String>) {
    printTriangle(char = '*')
    printTriangle(6, '@')
    printTriangle(7, char = '#')

    // printTriangle('#') // The character literal does not conform to the expected type Int
}
