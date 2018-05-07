

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
	test()
}
fun test() {
	// 一个简单的for循环
	for( i in 0 until 10) {
		println("i的值是: ${i}")
		if ( i == 1) {
			return
		}
		println("return后的输出语句")
	}
}
