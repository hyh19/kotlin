

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
	// ʹ�ñ������������������
	var range1 = 2 .. 6
	for( num in range1 ) {
		println("${num} * 5 = ${num * 5}")
	}

	// ��������
	val books = arrayOf("Swift" , "Kotlin" , "C" , "C++")
	// ʹ�ð뿪�����������������
	for ( index in 0 until books.size) {
		println("��${index+1}�������ǣ�${books[index]}")
	}
}