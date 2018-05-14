package com.easy.kotlin

/**
 * 7.10 密封类
 */

sealed class Expression

// 密封类的所有子类都必须与密封类在同一个文件中声明
class Unit : Expression()

data class Const(val number: Double) : Expression()
data class Sum(val e1: Expression, val e2: Expression) : Expression()
data class Multiply(val e1: Expression, val e2: Expression) : Expression()
object NaN : Expression()

// 使用密封类的主要场景是在使用 when 表达式的时候，能够验证语句覆盖了所有情况，而无需再添加一个 else 子句。
fun eval(expr: Expression): Double = when (expr) {
    is Unit -> 1.0
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    is Multiply -> eval(expr.e1) * eval(expr.e2)
// 如果少了一个分支，会报错。
    NaN -> Double.NaN // Error: 'when' expression must be exhaustive, add necessary 'NaN' branch or 'else' branch instead
// else -> 1.0 // 不再需要 else 子句，因为已经覆盖了所有的情况。
}


fun main(args: Array<String>) {
    val u = eval(Unit())
    val a = eval(Const(1.1))
    val b = eval(Sum(Const(1.0), Const(9.0)))
    val c = eval(Multiply(Const(10.0), Const(10.0)))
    println(u)
    println(a)
    println(b)
    println(c)
}
