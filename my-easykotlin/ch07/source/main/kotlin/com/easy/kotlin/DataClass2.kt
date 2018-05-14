package com.easy.kotlin

/**
 * 7.11.3 数据类的概念
 *
 * 数据类的构造函数必须要带上 val/var，因为编译器要把主构造函数中声明的所有属性，自动生成以下函数：
 * equals hashCode toString componentN copy
 * 如果我们自定义了这些函数，或者继承父类重写了这些函数，编译器就不会再去生成。
 */

data class Book(val name: String)

data class Fook(var name: String)

data class User(
        val name: String,
        val gender: String,
        val age: Int
) {
    fun validate(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {

    val book = Book("Book")
    book.name
    // 自动生成 copy
    book.copy("Book2")

    val jack = User("Jack", "Male", 1)
    jack.name
    jack.gender
    jack.age
    // 自动生成 toString
    jack.toString()
    jack.validate()

    // 改变部分属性
    val olderJack = jack.copy(age = 2)
    val anotherJack = jack.copy(name = "Jacky", age = 10)

    val rose = User("Rose", "Female", 2)
    rose.name
    rose.gender
    rose.age
    rose.toString()

    val helen = User("Helen", "Female", 15)
    // 自动生成 ComponentN
    val (name, gender, age) = helen
    println("$name, $gender, $age years of age")
}