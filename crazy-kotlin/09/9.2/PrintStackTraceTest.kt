

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
class SelfException: Exception{
	constructor() {}
	constructor(msg: String): super(msg) {}
}
class PrintStackTraceTest{
	fun firstMethod(){
		secondMethod()
	}
	fun secondMethod(){
		thirdMethod()
	}
	fun thirdMethod(){
		throw SelfException("�Զ����쳣��Ϣ")
	}
}
fun main(args: Array<String>) {
	PrintStackTraceTest().firstMethod()
}