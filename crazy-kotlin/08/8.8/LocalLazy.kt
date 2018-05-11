

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
fun main(args: Array<String>) {
	val name: String by lazy {
		println("计算name局部变量")
		"疯狂Kotlin讲义"
	}
	// 第一次访问name属性时，会执行Lambda表达式
	println(name)
	// 以后再次访问name属性时，直接使用第一次计算的值
	println(name)
}