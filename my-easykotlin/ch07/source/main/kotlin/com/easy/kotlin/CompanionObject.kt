package com.easy.kotlin

/**
 * 7.9.5 伴生对象
 */

class ClassA {
    companion object Factory {
        fun create(): ClassA = ClassA()
    }

    // 注意：一个类最多只能有一个伴生对象
    /*companion object Factory2 {
        fun create(): ClassA = ClassA()
    }*/
}

class ClassB {
    companion object {
        val index = 0
        fun create(): ClassB = ClassB()
        fun get() = "Hi, I am CompanyB"
    }
}

class ClassC {
    var index = 1
    fun get(index: Int): Int {
        return 1
    }

    // 指定伴生对象的名称，可以用来引用它。
    companion object CompanyC {
        val index = 0
        fun create(): ClassC = ClassC()
        fun get() = "Hi, I am CompanyC"
    }
}

fun main(args: Array<String>) {

    // 直接引用伴生对象的成员
    ClassB.index
    ClassB.create()
    ClassB.get()

    // 用关键字 Companion 引用
    ClassB.Companion.index
    ClassB.Companion.create()
    ClassB.Companion.get()

    // 用伴生对象的名称引用
    ClassC.CompanyC.index
    ClassC.CompanyC.create()
    ClassC.CompanyC.get()
}