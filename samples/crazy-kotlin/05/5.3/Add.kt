

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
fun main(args: Array<String>) {
	// ����һ���ɱ�Set
	var languages = mutableSetOf("Swift")
	// ���һ��Ԫ��
	languages.add("Go")
	languages.add("Lua")
	// ["Lua", "Go", "Swift"]
	println(languages)
	println(languages.count()) // ���3
	languages.addAll(setOf("Java", "Kotlin"))
	// [Swift, Go, Lua, Java, Kotlin]
	println(languages)
}