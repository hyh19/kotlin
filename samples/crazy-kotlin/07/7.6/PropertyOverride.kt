

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
open class Item{
	open protected var price: Double = 10.9
	open val name: String = ""
	open var validDays: Int = 0
}
class Book: Item{
	// 正确重写了父类的属性，类型兼容，访问权限更大
	override public var price: Double
	// 正确重写了父类的属性，读写属性重写只读属性
	override var name = "图书"
	// 重写错误，只读属性不能重写读写属性
	open val validDays: Int = 2
	constructor(){
		price = 3.0
	}
}
