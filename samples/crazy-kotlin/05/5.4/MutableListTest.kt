

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
	// �����ɱ伯��,����ֵ��List
	var mutableList = mutableListOf("Kotlin", null, "Go")
	// ������Ϊ2������һ����Ԫ��
	mutableList.add(2, "Java")
	println(mutableList) // [Kotlin, null, Java, Go]
	// ɾ������1����Ԫ��
	mutableList.removeAt(1)
	println(mutableList) // [Kotlin, Java, Go]
	// ������1����Ԫ���滻Ϊ"Lua"
	mutableList[1] = "Lua"
	println(mutableList) // [Kotlin, Lua, Go]
	// ���List���ϵ�����Ԫ��
	mutableList.clear();
	println(mutableList.size) // 0
}
