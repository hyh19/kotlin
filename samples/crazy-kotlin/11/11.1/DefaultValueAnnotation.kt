

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
annotation class MyTag(val name: String = "yeeku", 
	val age: Int = 29)

class Item {
	// 使用带属性的注解
	// 因为它的属性有默认值，所以可以不为它的属性指定值
	@MyTag
	fun info(){
//		...
	}
//	...
}
