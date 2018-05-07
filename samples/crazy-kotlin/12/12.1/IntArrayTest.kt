

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
	val iaf = IntArrayFun()
	// 由于sum()方法需要的参数是int[]类型，因此此处需要使用IntArray对象
	val intArr = intArrayOf(2, 4, 10)
	println(iaf.sum(intArr))
}