

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
class ThreadExceptionTest: Runnable{
	override fun run(){
		firstMethod()
	}
	fun firstMethod(){
		secondMethod()
	}
	fun secondMethod(){
		val a = 5
		val b = 0
		val c = a / b
	}
}
fun main(args: Array<String>) {
	Thread(ThreadExceptionTest()).start()
}