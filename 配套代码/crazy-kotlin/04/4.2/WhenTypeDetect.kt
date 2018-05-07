

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
fun main(args: Array<String>){
	var inputPrice = 26
	println(realPrice(inputPrice))
}
// 程序对inputPrice的类型进行判断
fun realPrice(inputPrice: Any) = when(inputPrice){
	// 如果inputPrice的类型为String，程序返回该字符串转换的Double值
	is String -> inputPrice.toDouble()
	// 如果inputPrice的类型为Int，程序返回该Int值转换的Double值
	is Int -> inputPrice.toDouble()
	is Double -> inputPrice
	else -> 0.0
}

