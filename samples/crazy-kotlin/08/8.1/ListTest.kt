

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
	var nums = listOf(20, 30, 100, 34, 67)
	// ���ó���ΪList��չ��shuffle()����
	println(nums.shuffle())
	println(nums.shuffle())
	var strList = listOf("Kotlin", "Java", "Go", "Erlang")
	println(strList.shuffle())
	println(strList.shuffle())
}