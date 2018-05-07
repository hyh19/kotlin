

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
	val obj: Any = "Hello"
	// obj变量的编译时类型为Any，Any与String存在继承关系，可以进行转换
	// 而且obj实际引用的实例是String类型，所以运行时也可通过
	val objStr = obj as String
	println(objStr)
	// 定义一个objPri变量，编译时类型为Any，实际类型为Int
	val objPri: Any = 5
	// objPri变量的编译时类型为Any，objPri的运行时类型为Int
	// Any与String存在继承关系，可以进行转换，编译通过
	// 但objPri变量实际引用的实例是Int类型，所以转换失败
	val str: String = objPri as String  // 转换失败
	val fkit = "fkit.org"
	val s: String = "Kotlin"
	// s变量的编译时类型为String，s的运行时类型为String
	// 但String与Number不存在继承关系，因此编译报警告：转换不可能成功
	val num: Number = s as Number  // 警告：转换不可能成功
}