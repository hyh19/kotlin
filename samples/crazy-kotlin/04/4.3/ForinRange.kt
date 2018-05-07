

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
	var max = 7
	var result = 1
	// 使用for-in循环遍历范围
	for( num in 1..max ) {
		result *= num
	}
	println(result)

	for( i in 1 until 5) {
		println("i: ${i}")
		// 对for-in循环的循环计数器赋值会导致错误
		i = 20
	}
}