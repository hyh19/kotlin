

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
// 定义三角形的三边
class Triangle(color: String, var a: Double, 
	var b: Double, var c: Double): Shape(color){
	fun setSides(a: Double, b: Double, c: Double){
		if (a >= b + c || b >= a + c || c >= a + b){
			println("三角形两边之和必须大于第三边")
			return
		}
		this.a = a
		this.b = b
		this.c = c
	}
	// 重写Shape类的计算周长的抽象方法
	override fun calPerimeter(): Double{
		return a + b + c
	}
	// 重写Shape类的代表形状的抽象属性
	override val type: String = "三角形"
}
