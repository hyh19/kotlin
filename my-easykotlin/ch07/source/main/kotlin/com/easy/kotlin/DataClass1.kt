package com.easy.kotlin

/**
 * 7.11.1 构造函数中的 val/var
 *
 * 几种类声明的写法
 */

// 写法一：name 只是构造函数的参数，不是类的属性，无法被外部访问到。
class Aook(name: String)

// 写法二：在类体中声明一个变量 name，把构造函数中的参数 name 赋值给它。
class Cook(name: String) {
    val name = name
}

// 写法三：构造函数中带 val/var 修饰的变量，Kotlin 编译器会自动为它们生成 getter/setter 函数。
class Dook(val name: String)

class Eook(var name: String)

fun main(args: Array<String>) {

    val aook = Aook("Aook")
    // aook.name // Error: Unresolved reference: name

    val cook = Cook("Cook")
    cook.name

    val dook = Dook("Dook")
    dook.name
    // val 修饰的变量是只读的
    // dook.name = "dook" // Error: Val cannot be reassigned

    val eook = Eook("Eook")
    eook.name
    eook.name = "eook"
}