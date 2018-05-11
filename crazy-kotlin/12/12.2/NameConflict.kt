

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
fun List<String>.filterValid(): List<String>{
	val result = mutableListOf<String>()
	for (s in this) {
		if (s.length < 5) {
			result.add(s)
		}
	}
	return result.toList()
}
@JvmName("fileterValidInt")
fun List<Int>.filterValid(): List<Int>{
	val result = mutableListOf<Int>()
	for (i in this) {
		if (i < 20) {
			result.add(i)
		}
	}
	return result.toList()
}