

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
import kotlin.reflect.*;
class MyDelegation{
	private var _backValue = "默认值"
	operator fun getValue(thisRef: Nothing?, property: KProperty<*>): String {
		println("${thisRef}的${property.name}属性执行getter方法")
		return _backValue
	}
	operator fun setValue(thisRef: Nothing?, property: KProperty<*>, newValue: String) {
		println("${thisRef}的${property.name}属性执行setter方法" + 
			"，传入参数值为：${newValue}")
		_backValue = newValue
	}
}
fun main(args: Array<String>) {
	var name: String by MyDelegation()
	// 访问局部变量，实际上是调用MyDelegation对象的getValue()方法
	println(name)
	// 对局部变量赋值，实际上是调用MyDelegation对象的setValue()方法
	name = "新的值"
	println(name)
}