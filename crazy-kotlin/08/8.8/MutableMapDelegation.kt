

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
class MutableItem(val map: MutableMap<String, Any?>) {
	var barCode: String by map
	var name: String by map
	var price: Double by map
}
fun main(args: Array<String>) {
	val item = MutableItem(mutableMapOf(
	))
	// ����item��������ԣ���ʵ��ί�и�MutableMap����
	item.barCode = "133333"
	item.name = "���Kotlin����"
	item.price = 69.8
	println("---------------")
	// ��������е�map��¶���������������ͨ����׼Map��ȡ����
	val map = item.map
	println(map["barCode"])  // ���133333
	println(map["name"])  // ������Kotlin����
	println(map["price"])  // ���69.8
	map["price"] = 78.8
	println(item.price)  // ���78.8
}