

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
	// 循环的初始化条件
	var count = 0
	// 当count小于10时，执行循环体
	while (count < 10) {
		println("count:${count}")
		// 迭代语句
		count++
	}
	println("循环结束!")

	// 下面是一个死循环
	var count2 = 0
	while (count2 < 10) {
		print("不停执行的死循环 ${count2}")
		count2--
	}
	println("永远无法跳出的循环体")
}