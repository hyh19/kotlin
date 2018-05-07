

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
	// 外层循环，outer作为标识符
	outer@ for (i in 0 until 5 ) {
		// 内层循环
		for (j in 0 until 3 ) {
			println("i的值为:${i}, j的值为:${j}")
			if (j == 1) {
				// 跳出outer标签所标识的循环
				break@outer
			}
		}
	}
}