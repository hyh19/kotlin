

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	var str = "fkjava.org"
	// ����String��contains�����ж�
	println( str.contains("java") )
	// ʹ��in������ж�
	println("java" in str)
	val array = arrayOf(24, 45, 100, -3, 30)
	// ����Array��contains�����ж�
	println(array.contains(100))
	// ʹ��in������ж�
	println(100 in array)
}

