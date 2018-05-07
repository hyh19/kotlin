

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
	// 定义一个Short类型变量
	var sValue: Short = 5
	// 表达式中的sValue将自动提升到Int类型，则右边的表达式类型为Int
	// 将一个Int类型值赋给Short类型变量将发生错误
//	sValue = sValue - 2


	var b: Byte = 40
	var c: Short = 97
	var i: Int = 23
	var d: Double = .314
	// 右边表达式中最高等级操作数为d（Double类型）
	// 则右边表达式的类型为Double类型,result将会推断为Double类型
	val result = b + c + i * d
	// 将输出144.222
	println(result)


	var iVal: Int = 3
	// 右边表达式中两个操作数都是Int类型，故右边表达式的类型为Int
	// 虽然23/3不能除尽，但依然得到一个Int类型整数
	val intResult = 23 / iVal;
	println(intResult) // 将输出7

	// 输出字符串Hello!a7
	println("Hello!" + 'a' + 7)
	// 输出字符串hHello!
	println('a' + 7 + "Hello!")

}