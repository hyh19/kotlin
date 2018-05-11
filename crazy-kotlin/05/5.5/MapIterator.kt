

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
	var map = mapOf("Java" to 86, "Kotlin" to 92, "Go" to 76)
	// ����Map��key-value�ԣ�entrisԪ�ط���key-value����ɵ�Set
	for (en in map.entries) {
		println("${en.key} -> ${en.value}")
	}
	// �ȱ���Map��key�ԣ���ͨ��key��ȡvalue
	for (key in map.keys ) {
		println("${key} -> ${map[key]}")
	}
	// ֱ����for-inѭ������Map
	for( (key,value) in map){
		println("${key} -> ${value}")
	}
	// ��lambda���ʽ����Map
	map.forEach({println("${it.key} -> ${it.value}")})
}