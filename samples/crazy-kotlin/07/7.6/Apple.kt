

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
// 定义Apple类继承Fruit
class Apple: Fruit(0.0)
fun main(args: Array<String>) {
	// 创建Apple对象
	var a = Apple()
	// Apple对象本身没有weight属性
	// 因为Apple的父类有weight属性，也可以访问Apple对象的weight属性
	a.weight = 56.0
	// 调用Apple对象的info()方法
	a.info()
}