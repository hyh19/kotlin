

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

// 该注解的target属性的类型是MyTag
annotation class ShowTag(val message: String,
	val target: MyTag)

@ShowTag("message属性值", target = MyTag("yeeku"))
class Circle