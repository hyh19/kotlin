

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

data class Data(val x: Int, val y: Int){
	// 为Data类定义一个unaryMinus()方法
	operator fun unaryMinus(): Data {
		return Data(-x, -y)
	}
}
// 以扩展方法的形式为Data类定义not()方法
operator fun Data.not(): Data {
	return Data(-x, -y)
}
fun main(args: Array<String>) {
	val d = Data(4, 10)
	println(-d) // 输出Data(x=-4, y=-10)
	println(!d) // 输出Data(x=-4, y=-10)
}