

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
	// 调用有参数的构造器创建实例
	var im = Item("1333", "疯狂Kotlin讲义", 69.8)
	// 通过点语法访问对象的属性
	println(im.barCode)
	println(im.name)
	println(im.price)
}