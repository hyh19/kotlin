

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
	// 使用Lambda表达式创建Runnable实例
	var t = Runnable{
		for (i in 0..100) {
			println("${Thread.currentThread().getName()},i: ${i}")
		}
	}
	// 启动新线程
	Thread(t).start()
	// 主线程的循环
	for (i in 0..100) {
		println("${Thread.currentThread().getName()},i: ${i}")
	}
}