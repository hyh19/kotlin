

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
// 定义计算阶乘的函数
fun fact(n: Int): Int{
	if (n == 1){
		return 1
	} else {
		return n * fact(n - 1)
	}
}

// 使用尾递归函数的语法
tailrec fun factRec(n: Int, total: Int = 1): Int = 
	if (n == 1) total else factRec(n - 1, total * n)
fun main(args: Array<String>) {
	println(factRec(5))
}