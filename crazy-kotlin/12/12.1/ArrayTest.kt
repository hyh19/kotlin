

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
	val array = arrayOf(1, 2, 3, 4)
	// ����ʹ��get()��set()������������Ԫ��
	// ʵ���ϻ���ͨ��Java����Ŀ��ٷ���
	array[2] = array[2] * 2
	// ʹ��������λ�ǻ���Java����Ԫ�������ڴ��ַ�Ŀ��ٷ���
	// ����Ҫ����������
	for (i in array.indices) {
		array[i] += 2
	}
	// for-inѭ��Ҳ�ǻ���Java����Ԫ�������ڴ��ַ�Ŀ��ٷ���
	// ����Ҫ����������
	for (x in array) {
		println(x)
	}
}