

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
	// 定义一个可变Set
	var languages = mutableSetOf("Swift")
	// 添加一个元素
	languages.add("Go")
	languages.add("Lua")
	// ["Lua", "Go", "Swift"]
	println(languages)
	println(languages.count()) // 输出3
	languages.addAll(setOf("Java", "Kotlin"))
	// [Swift, Go, Lua, Java, Kotlin]
	println(languages)
}