

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
	val s1 = "2.34"
	// ��s1�ַ���ת��Double
	val d: Double = s1.toDouble()
	println(d)
	var s2 = "45"
	// ��s2�ַ���ת��Int
	var i: Int = s2.toInt()
	println(i)

	val str = "fkjava.org"
	println(str.capitalize()); // ����ĸ��д
	println(str.decapitalize()); // ����ĸСд

	var str2 = "crazyit.org"
	// ���������ַ�����ͬ��ǰ׺
	println(str2.commonPrefixWith("crazyjava.org"));
	// ���������ַ�����ͬ�ĺ�׺
	println(str2.commonSuffixWith("fkit.org"));

	var str3 = "java886"
	// �ж�str3�Ƿ����3������������
	println(str3.contains(Regex("\\d{3}")))
}