

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
import kotlin.reflect.*
import kotlin.reflect.full.*
class Item{
	var name: String = "疯狂Kotlin讲义"
	val price: Double = 76.6
}
var foo = "测试属性"
fun main(args: Array<String>) {
	// 获取foo属性，属于KMutableProperty0的实例
	val topProp = ::foo
	topProp.set("修改后的属性")
	println(topProp.get())

	val im = Item()
	// 获取Item的name属性，属于KMutableProperty1的实例
	val mp = Item::name
	mp.set(im, "疯狂Java讲义")
	println(mp.get(im))

	// 获取Item的name属性，属于KProperty1的实例
	val prop = Item::price
	println(prop.get(im))
}