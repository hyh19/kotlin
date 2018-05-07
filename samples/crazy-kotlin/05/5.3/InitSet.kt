

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
	// �������ɱ伯��,����ֵ��Set
	var set = setOf("Java", "Kotlin", "Go")
	println(set) // ����Ԫ�ذ����˳������
	// �����ɱ伯��,����ֵ��MutableSet
	var mutableSet = mutableSetOf("Java", "Kotlin", "Go")
	println(mutableSet) // ����Ԫ�ذ����˳������
	println("setOf�ķ��ض����ʵ������:${set.javaClass}")
	println("mutableSetOf�ķ��ض����ʵ������:${mutableSet.javaClass}")
	// ����HashSet����
	var hashSet = hashSetOf("Java", "Kotlin", "Go")
	println(hashSet) // ����֤Ԫ�ص�˳��
	// ����LinkedHashSet����
	var linkedHashSet = linkedSetOf("Java", "Kotlin", "Go")
	println(linkedHashSet) // ����Ԫ�ذ����˳������
	// ����TreeSet����
	var treeSet = sortedSetOf("Java", "Kotlin", "Go")
	println(treeSet) // ����Ԫ����С��������
}