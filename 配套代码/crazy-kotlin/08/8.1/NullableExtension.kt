

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
// Ϊ�ɿ�������չequals����
fun Any?.equals(other: Any?): Boolean{
	if (this == null) {
		return if (other == null ) true else false
	}
	return other.equals(other)
}
fun main(args: Array<String>) {
	var a = null
	println(a.equals(null)) // ���true
	println(a.equals("Kotlin")) // ���false
}