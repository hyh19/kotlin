

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
open class BaseClass {
	// test()方法是private访问权限，子类不可访问该方法
	private fun test(){}
}
class SubClass: BaseClass(){
	// 此处并不是方法重写，所以不可以用override修饰
	fun test(){}
}
