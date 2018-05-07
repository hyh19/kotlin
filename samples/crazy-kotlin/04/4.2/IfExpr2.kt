

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
fun main(args: Array<String>) {
	var age = 18
	// 将if表达式赋值给str变量
	var str = if (age > 20) {
		println("大于20的分支")
		"age大于20"
	} else if(age < 20) {
		println("小于20的分支")
		"age小于20"
	} else {
		println("else的分支")
		"age等于20"
	}
	println(str)
}