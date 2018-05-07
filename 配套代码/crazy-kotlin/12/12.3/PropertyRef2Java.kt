

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
import kotlin.reflect.jvm.*
class Item{
	var name: String = "疯狂Kotlin讲义"
	val price: Double = 76.6
}
var foo = "测试属性"
fun main(args: Array<String>) {
	// 获取foo属性，属于KMutableProperty0的实例
	val topProp = ::foo
	println(topProp.javaField) // 获取幕后字段
	println(topProp.javaGetter) // 获取getter方法
	println(topProp.javaSetter)	// 获取setter方法

	// 获取Item的name属性，属于KMutableProperty1的实例
	val mp = Item::name
	println(mp.javaField) // 获取幕后字段
	println(mp.javaGetter) // 获取getter方法
	println(mp.javaSetter)	// 获取setter方法

	// 获取Item的name属性，属于KProperty1的实例
	val prop = Item::price
	println(prop.javaField) // 获取幕后字段
	println(prop.javaGetter) // 获取getter方法
}