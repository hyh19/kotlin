

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

// ���涨����4�����������
const val a = 5 + 2
const val b: Double = 1.2 / 3
const val str: String = "���" + "Java"
const val book: String = "���Java���壺" + 99.0
// �����book2������ֵ��Ϊʹ������һ�������������޷��ڱ���ʱ��ȷ������
val d = 99.0
const val book2: String = "���Java���壺" + d  //��
fun main(args: Array<String>) {
	println(book === "���Java���壺99.0")
}