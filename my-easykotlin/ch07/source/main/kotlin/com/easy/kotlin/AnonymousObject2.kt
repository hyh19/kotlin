package com.easy.kotlin

/**
 * 7.9.4 匿名 object
 *
 * 匿名对象只可以用在本地和私有作用域中声明的类型
 */

class AnonymousObjectType {
    // 私有函数，返回的是匿名 object 类型。
    private fun privateFoo() = object {
        val x: String = "x"
    }

    // 公有函数，返回的是 Any 类型。
    fun publicFoo() = object {
        val x: String = "x" // 无法访问到
    }

    fun test() {
        val x1 = privateFoo().x
        println(x1)
        // val x2 = publicFoo().x // Error: Kotlin: Unresolved reference: x
    }
}

fun main(args: Array<String>) {
    AnonymousObjectType().test()
}