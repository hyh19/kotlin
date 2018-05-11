

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
class Item(val map: Map<String, Any?>) {
	val barCode: String by map
	val name: String by map
	val price: Double by map
}
fun main(args: Array<String>) {
	val item = Item(mapOf(
		"barCode" to "133355",
		"name" to "疯狂Kotlin讲义",
		"price" to 68.9
	))
	println(item.barCode)
	println(item.name)
	println(item.price)
	println("---------------")
	// 将对象持有的map暴露出来，其他程序可通过标准Map读取数据
	val map = item.map
	println(map["barCode"])
	println(map["name"])
}