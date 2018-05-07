

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
	var addr = Address()
	// 通过点语法对属性赋值，实际就是调用setter方法
	addr.street = "大岗工业路"
	addr.city = "广州"
	// 通过点语法访问属性，实际就是调用getter方法
	println(addr.city)
	println(addr.street)
}