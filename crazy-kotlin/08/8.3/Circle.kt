

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
class Circle(color: String, var radius: Double): Shape(color){
	// 重写Shape类的计算周长的抽象方法
	override fun calPerimeter(): Double = 2 * Math.PI * radius
	// 重写Shape类的代表形状的抽象属性
	override val type: String = "圆形"
}
fun main(args: Array<String>){
	var s1: Shape = Triangle("黑色" , 3.0 , 4.0, 5.0)
	var s2: Shape = Circle("黄色" , 3.0)
	println(s1.type)
	println(s1.calPerimeter())
	println(s2.type)
	println(s2.calPerimeter())
}