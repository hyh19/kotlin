

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
	// ʹ�÷���������������������
	var range1 = 6 downTo 2
	for( num in range1 ) {
		println("${num} * 5 = ${num * 5}")
	}
	// Ϊ���������ָ������
	for( num in 7 downTo 1 step 2 ) {
		println("${num} * 5 = ${num * 5}")
	}
}