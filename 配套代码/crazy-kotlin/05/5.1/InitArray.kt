

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
	// ��������ָ��Ԫ�ص����飨�൱��Java����ľ�̬��ʼ����
	var arr1 = arrayOf("Java", "Kotlin", "Swift", "Go")
	var intArr1 = arrayOf(2, 4, 500, -34)
	// ����ָ�����ȡ�Ԫ��Ϊnull�����飨�൱��Java����Ķ�̬��ʼ����
	var arr2 = arrayOfNulls<Double>(5)
	var intArr2 = arrayOfNulls<Int>(6)
	// ��������Ϊ0�Ŀ�����
	var arr3 = emptyArray<String>()
	var intArr3 = emptyArray<Int>()
	// ����ָ�����ȡ�ʹ��Lambda���ʽ��ʼ������Ԫ�ص�����
	var arr4 = Array(5, {(it * 2 + 97).toChar()})
	var strArr4 = Array(6, {"fkit"})
}