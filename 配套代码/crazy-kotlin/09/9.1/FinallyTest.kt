

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
	var fis: FileInputStream? = null
	try {
		fis = FileInputStream("a.txt")
	} catch (ioe: IOException) {
		println(ioe.message)
		// return语句强制方法返回
		return       // ①
		// 使用exit退出虚拟机
		// System.exit(1)     // ②
	} finally {
		// 关闭磁盘文件，回收资源
		fis?.close()
		println("执行finally块里的资源回收!")
	}
}