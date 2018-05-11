

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
// 为泛型形参T扩展
fun <T> T.toBookString(): String{
	return "《${this.toString()}》"
}
fun main(args: Array<String>) {
	val a = 2
	// 显式指定泛型函数的T为Int类型
	println(a.toBookString<Int>())
	// 不显式指定泛型函数的T的类型，系统推断T为Double类型
	println(3.4.toBookString())
	val str = "疯狂Kotlin讲义"
	// 不显式指定泛型函数的T的类型，系统推断T为String类型
	println(str.toBookString())
}