

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
	var a = test()
	println(a)
}
fun test(): Boolean {
	try {
		// 因为finally块中包含了return语句
		// 所以下面的return语句失去作用
		return true
	} finally {
		return false
	}
}