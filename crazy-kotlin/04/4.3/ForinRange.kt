

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
	var max = 7
	var result = 1
	// ʹ��for-inѭ��������Χ
	for( num in 1..max ) {
		result *= num
	}
	println(result)

	for( i in 1 until 5) {
		println("i: ${i}")
		// ��for-inѭ����ѭ����������ֵ�ᵼ�´���
		i = 20
	}
}