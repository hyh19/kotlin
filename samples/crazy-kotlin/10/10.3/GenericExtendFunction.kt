

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
// Ϊ�����β�T��չ
fun <T> T.toBookString(): String{
	return "��${this.toString()}��"
}
fun main(args: Array<String>) {
	val a = 2
	// ��ʽָ�����ͺ�����TΪInt����
	println(a.toBookString<Int>())
	// ����ʽָ�����ͺ�����T�����ͣ�ϵͳ�ƶ�TΪDouble����
	println(3.4.toBookString())
	val str = "���Kotlin����"
	// ����ʽָ�����ͺ�����T�����ͣ�ϵͳ�ƶ�TΪString����
	println(str.toBookString())
}