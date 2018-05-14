package com.easy.kotlin

/**
 * 7.11.4 数据类的限制
 */

// 限制一：主构造函数需要至少有一个参数
// data class Gook // Error: Data class must have at least one primary constructor parameter

// 限制而：主构造函数的所有参数需要标记为 val 或 var
// data class Hook(name: String) // Error: Data class primary constructor must have only property (val / var) parameters

// 限制三：数据类不能是抽象、开放、密封或者内部的
// abstract data class Iook(val name: String) // Error: Modifier 'abstract' is incompatible with 'data'
// open data class Jook(val name: String) // Error: Modifier 'open' is incompatible with 'data'
// sealed data class Kook(val name: String) // Error: Modifier 'sealed' is incompatible with 'data'
// inner data class Look(val name: String) // Error: Modifier 'data' is incompatible with 'inner'

// 数据类只能是 final 的
final data class Mook(val name: String)

open class DBase
interface IBaseA
interface IBaseB

// 在 1.1 之前数据类只能实现接口，自 1.1 起，数据类可以扩展其他类。
data class LoginUser(val name: String = "", val password: String = "") : DBase(), IBaseA, IBaseB {

    var isActive = true

    // 跟普通类一样，数据类也可以有次级构造函数。
    constructor(name: String, password: String, isActive: Boolean) : this(name, password) {
        this.isActive = isActive
    }
}

fun main(args: Array<String>) {

    val loginUser1 = LoginUser("Admin", "admin")
    // ComponentN
    println(loginUser1.component1())
    println(loginUser1.component2())

    // 构造函数的参数使用默认值
    val loginUser2 = LoginUser()
    loginUser2.name
    loginUser2.password
}