

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
	var age = 30
	if (age > 20) {
	// 只有当age > 20时，下面花括号括起来的语句块才会执行
	// 花括号括起来的语句是一个整体，要么一起执行，要么一起不会执行
		println("年龄已经大于20岁了")
		println("20岁以上的人应该学会承担责任...")
	}

	// 定义变量a，并为其赋值
	val a = 5
	if (a > 4)
		// 如果a>4，则执行下面的执行体，只有一行代码作为代码块
		println("a大于4")
	else
		// 否则，执行下面的执行体，只有一行代码作为代码块
		println("a不大于4")


	// 定义变量b，并为其赋值
	var b = 5
	if (b > 4)
		// 如果b>4，则执行下面的执行体，只有一行代码作为代码块
		out.println("b大于4")
	else
		// 否则，执行下面的执行体，只有一行代码作为代码块
		b--
		//对于下面代码而言，它已经不再是条件执行体的一部分，因此总会执行
		out.println("b不大于4")


// 定义变量c，并为其赋值
var c = 5
if (c > 4)
	// 如果c>4，则执行下面的执行体，将只有c--;一行代码为执行体
	c--
	// 下面是一行普通代码，不属于执行体
	println("c大于4")
// 此处的else将没有if语句，因此编译出错
else
	// 否则，执行下面的执行体，只有一行代码作为代码块
	println("c不大于4")


}