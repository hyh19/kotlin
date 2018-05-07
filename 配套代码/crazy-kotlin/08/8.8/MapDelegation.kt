

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
class Item(val map: Map<String, Any?>) {
	val barCode: String by map
	val name: String by map
	val price: Double by map
}
fun main(args: Array<String>) {
	val item = Item(mapOf(
		"barCode" to "133355",
		"name" to "���Kotlin����",
		"price" to 68.9
	))
	println(item.barCode)
	println(item.name)
	println(item.price)
	println("---------------")
	// ��������е�map��¶���������������ͨ����׼Map��ȡ����
	val map = item.map
	println(map["barCode"])
	println(map["name"])
}