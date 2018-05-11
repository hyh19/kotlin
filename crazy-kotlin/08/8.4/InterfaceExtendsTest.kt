

/**
 * Description:<br>
 * 利嫋: <a href="http://www.crazyit.org">決髄Java選男</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
interface InterfaceA{
	val propA: Int
		get() = 5
	fun testA()
}
interface InterfaceB{
	val propB: Int
		get() = 6
	fun testB()
}
interface InterfaceC: InterfaceA, InterfaceB{
	val propC: Int
		get() = 7
	fun testC()
}

