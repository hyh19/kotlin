

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
class A1: Apple<String>(){
	// 正确重写了父类的属性，属性类型
	// 与父类Apple<String>的属性类型完全相同
	override var info: String? = null
		get() = "子类" + super.info
	/*
	// 下面方法是错误的，重写父类方法时返回值类型不一致
	override var info: Object? = null
	*/
}
