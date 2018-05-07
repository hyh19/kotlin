

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
	// 读取一行输入
	val ln = readLine()
	// ln是String?类型，所以需要先判断ln不为null
	if(ln != null){
		// when分支不需要任何条件表达式
		when {
			// 每个分支条件都是布尔表达式
			ln.matches(Regex("\\d+")) -> println("您输入的全是数字")
			ln.matches(Regex("[a-zA-Z]+")) -> println("您输入的全是字母")
			ln.matches(Regex("[a-zA-Z0-9]+")) -> println("您输入的是字母和数字")
			else -> println("您输入的包含特殊字符")
		}
	}
}
