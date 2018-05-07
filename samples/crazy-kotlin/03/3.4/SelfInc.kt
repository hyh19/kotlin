

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
	// 为Data类定义一个inc()方法
	operator fun inc(): Data {
		return Data(x + 1, y + 1)
	}
}
// 以扩展方法的形式为Data类定义dec()方法
operator fun Data.dec(): Data {
	return Data(x - 1, y - 1)
}
fun main(args: Array<String>) {
	var d = Data(4, 10)
	println(d++) // 先用、再自加，输出Data(x=4, y=10)
	println(d) // 输出自加后的d：Data(x=5, y=11)
	var dd = Data(9, 20)
	println(--dd) // 先自减，再用，输出Data(x=8, y=19)
	println(dd) // 输出自加后的dd：Data(x=8, y=19)
}