

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
import java.io.*
fun main(args: Array<String>) {
	// 下面代码代码可能引发IOException（checked异常）
	// 但Kotlin并不强制处理该异常
	val fis = FileInputStream("aa.txt")
	println(fis.read())
}