

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	var str = "fkjava.org"
	// ����get������ȡָ���������ַ�
	println(str.get(2))
	// ʹ���������������ȡָ���������ַ�
	println(str[2])
	// ����Java��ArrayList����
	var list = java.util.ArrayList<String>()
	list.add("Java")
	list.add("Kotlin")
	list.add("Go")
	// ʹ���������������ȡָ��������List����Ԫ��
	println(list[1])
	// ʹ��������������޸�ָ��������List����Ԫ��
	list[2] = "Swift"
	println(list)
}

