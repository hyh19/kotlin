

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
class User(var name: String? = null, var pass: String? = null)
fun main(args: Array<String>) {
	val user = User()
	// 在Elvis表达式中使用throw表达式
	// throw表达式表示程序出现异常，不会真正对变量赋值
	val th: String = user.name ?: throw NullPointerException("目标对象不能为null")
	println(th)

	val s: String = user.name ?: fail("目标对象不能为null")
	println(s)
}
fun fail(message: String): Nothing {
	throw IllegalArgumentException(message)
}