

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
import java.util.Arrays
fun main(args: Array<String>) {
	// ��������ָ��Ԫ�ص����飨�൱��Java����ľ�̬��ʼ����
	var intArr = intArrayOf(2, 4, 30, -5)
	var doubleArr = doubleArrayOf(2.3, 3.5, -3.0)
	// ����ָ�����ȡ�ʹ��Lambda���ʽ��ʼ������Ԫ�ص�����
	var intArr2 = IntArray(5, {it * it})
	var charArr = CharArray(5, {(it * 2 + 97).toChar()})
	println(Arrays.toString(intArr2))
	println(Arrays.toString(charArr))
}