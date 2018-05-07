

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
	// 定义变量count
	var count = 1
	// 执行do while循环
	do {
		println(count)
		// 循环迭代语句
		count++
		// 循环条件紧跟while关键字
	} while (count < 10)
	println("循环结束!")

	// 定义变量count2
	var count2 = 20
	// 执行do while循环
	do
		// 这行代码把循环体和迭代部分合并成了一行代码
		println(count2++)
	while (count2 < 10)
	println("循环结束!")

}
