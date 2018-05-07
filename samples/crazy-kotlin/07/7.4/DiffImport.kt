

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
import java.util.Date
// 导入java.sql.Date，并指定别名为SDate
import java.sql.Date as SDate
fun main(args: Array<String>) {
	// 使用java.util.Date
	var d = Date()
	// 使用java.sql.Date
	var d2 = SDate(System.currentTimeMillis())
	println(d)
	println(d2)
}