

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
	val list = listOf(2, 3, 10)
	// is�жϲ��ܼ�ⷺ�Ͳ���
//	println(list is List<String>)
	// ֻ�ܼ���Ǻ�ͶӰ
	println(list is List<*>) // ���true
}