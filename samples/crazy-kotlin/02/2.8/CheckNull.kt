

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
	var b: String? = "fkit"
	// 先判断b不为null，然后访问b的length属性
	var len = if (b != null) b.length else -1
	println("b的长度:${len}")
	b = null
	// 先判断b不为null，然后调用b的length属性
	if (b != null && b.length > 0) {
		// 访问b的length属性
		println(b.length)
	}
	else {
		println("空字符串")
	}
}