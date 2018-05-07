

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
	// �������ɱ伯��,����ֵ��Map
	var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(map) // key-value�԰����˳������
	// �����ɱ伯��,����ֵ��MutableMap
	var mutableMap = mutableMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(mutableMap) // key-value�԰����˳������
	println("mapOf�ķ��ض����ʵ������:${map.javaClass}")
	println("mutableMapOf�ķ��ض����ʵ������:${mutableMap.javaClass}")
	// ����HashMap����
	var hashMap = hashMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(hashMap) // ����֤key-value�Ե�˳��
	// ����LinkedHashMap����
	var linkedHashMap = linkedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(linkedHashMap) // key-value�԰����˳������
	// ����TreeMap����
	var treeMap = sortedMapOf("Java" to 86, "Kotlin" to 92, "Go" to 78)
	println(treeMap) // key-value�԰�key��С��������
}