

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
	// �������ɱ伯��,����ֵ��List
	var list1 = listOf("Java", "Kotlin", null, "Go")
	println(list1) // ���ϰ���null
	// �������ɱ伯��,����ֵ��List
	var list2 = listOfNotNull("Java", "Kotlin", null, "Go")
	println(list2) // ���ϲ�����null
	// �����ɱ伯��,����ֵ��MutableList
	var mutableList = mutableListOf("Java", "Kotlin", null, "Go")
	println(mutableList)
	println("listOf�ķ��ض����ʵ������:${list1.javaClass}")
	println("listOfNotNull�ķ��ض����ʵ������:${list2.javaClass}")
	println("mutableList�ķ��ض����ʵ������:${mutableList.javaClass}")
	// ����ArrayList����
	var arrayList = arrayListOf("Java", "Kotlin", null, "Go")
	println(arrayList)
}
