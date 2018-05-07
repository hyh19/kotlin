

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
	 //<*>必不可少 相当于Java的原始类型
	var list: ArrayList<*> = arrayListOf(1, "Kotlin")
	println(list)

	var a: List<*> = listOf(2, 3.4)
	println(a.get(0))
	println(a.get(1))
}