

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
// 定义带value属性的注解
annotation class MyTag(val value:String)

class Category {
	// 为value属性指定属性值无需指定属性名
	@MyTag("yeeku")
	fun info(){
//		...
	}
//	...
}
