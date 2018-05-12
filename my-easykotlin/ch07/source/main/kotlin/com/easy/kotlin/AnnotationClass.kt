package com.easy.kotlin

/**
 * 7.8 注解类
 */

// 这个注解可用于哪些元素
@Target(AnnotationTarget.CLASS,
        AnnotationTarget.FUNCTION,
        AnnotationTarget.EXPRESSION,
        AnnotationTarget.FIELD,
        AnnotationTarget.LOCAL_VARIABLE,
        AnnotationTarget.TYPE,
        AnnotationTarget.TYPEALIAS,
        AnnotationTarget.TYPE_PARAMETER,
        AnnotationTarget.VALUE_PARAMETER)

// 这个注解的信息是否被保存到编译后的 class 文件中，以及在运行时是否可以通过反射访问它。
@Retention(AnnotationRetention.SOURCE)

// 这个注解的信息是否包含在自动产生的 API 文档的类或函数签名中
@MustBeDocumented

// 是否允许在单个元素上多次使用同一个注解
@Repeatable
annotation class MagicClass


@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class MagicFunction


@Target(AnnotationTarget.CONSTRUCTOR)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Repeatable
annotation class MagicConstructor


@MagicClass // 注解类
class Foo @MagicConstructor constructor() { // 注解主构造器，主构造器必须加上关键字 constructor。

    constructor(index: Int) : this() {
        this.index = index
    }

    @MagicClass // 注解字段
    var index: Int = 0

    @MagicFunction // 注解函数
    fun magic(@MagicClass name: String) { // 注解参数

    }
}