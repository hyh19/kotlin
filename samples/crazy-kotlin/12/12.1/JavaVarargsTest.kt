

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
	val jv = JavaVarargs()
	jv.test(2, 4, 5)
	val intArr = intArrayOf(6, 20, 33)
	// 将数组解开成多个元素
	jv.test(*intArr)
}
