

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
	val str = "Kotlin"
	// 获取对象绑定的方法
	val f: (CharSequence, Boolean)->Boolean = str::endsWith
	// 调用绑定的方法时无需传入调用者
	println(f("lin" , true))
	// 获取对象绑定的属性
	val prop = str::length
	// 调用绑定的属性时无需传入调用者
	println(prop.get())

	var list = listOf("Kotlin", "Java", "Go", "Erlang")
	// 获取对象绑定的方法
	val fn = list::subList
	// 调用绑定的方法时无需传入调用者
	println(fn(1, 3)) // 输出["Java", "Go"]
	// 获取对象绑定的属性
	val prp = list::indices
	// 调用绑定的属性时无需传入调用者
	println(prp.get()) // 输出0..3
}