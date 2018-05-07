

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
open class BaseClass{
	open var a: Int = 5
}
class SubClass: BaseClass()
{
	override var a: Int = 7
	fun accessOwner(){
		println(a)
	}
	fun accessBase(){
		// ͨ��super���޶����ʴӸ���̳еõ���a����
		println(super.a)
	}
}
fun main(args: Array<String>) {
	val sc = SubClass()
	sc.accessOwner() // ���7
	sc.accessBase() // ���5
}