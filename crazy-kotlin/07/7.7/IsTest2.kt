

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
	var a: Any = "fkit"
	// 直接访问a的length属性，编译器报错。
	// 由于a是的编译时类型是Any，因此编译时它没有length属性
//	println(a.length)
	// 先判断a为String，if的条件体中a被自动转为String类型
	if (a is String) println(a.length)
	test(a)
	when(a) {
		// 如果进入该分支，表明a是String类型，可调用String的方法
		is String -> println(a.length)
		// 如果进入该分支，表明a是Int类型，可调用Int的方法
		is Int -> println(a.toDouble())
	}

	// 能进入&&之后的表达式，表明a是String类型
	// 因此在&&之后可调用a的length属性
	if (a is String && a.length > 3) {
		println("a的长度大于3")
	}
	foo(a)
}
fun test(x: Any){
	// 如果x不是String，函数返回
	if (x !is String) return
	// 因此以下部分，x会被自动转为String
	println("x的长度为：${x.length}")
}
fun foo(x: Any){
	// 能进入||之后的表达式，表明a是String类型
	// 因此在||之后可调用a的length属性
	if (x !is String || x.length == 0)
		return
	// 以下部分x会被自动转为String
	println("x的长度为：${x.length}")
}