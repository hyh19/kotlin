

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
	// 不是该异常在Java中是否为checked异常。
	// 在Kotlin中该异常都不是checked异常
	throwChecked(-3)
	throwRuntime(3)
}
fun throwChecked(a: Int) {
	if (a > 0) {
		// 自行抛出普通异常，在Kotlin中也不是checked异常
		// 该代码不必处于try块里，也不必处于带throws声明的方法中
		throw Exception("a的值大于0，不符合要求")
	}
}
fun throwRuntime(a: Int) {
	if (a > 0) {
		throw RuntimeException("a的值大于0，不符合要求")
	}
}

