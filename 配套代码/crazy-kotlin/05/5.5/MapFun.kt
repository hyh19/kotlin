

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
	// �ж��Ƿ�����key-value�Ե�key�ĳ��ȴ���4��value����80
	println(map.all({it.key.length > 4 && it.value > 80})) // ���false
	// �ж��Ƿ���һkey-value�Ե�key�ĳ��ȴ���4��value����80
	println(map.any({it.key.length > 4 && it.value > 80}))  // ���true

	// ������contains()���������Կ���in��!in�����
	println("Java" in map) // ���true
	println("Go" !in map) // ���false

	// ��Map����Ԫ�ؽ��й��ˣ�Ҫ��key����li
	val filteredMap = map.filter({"li" in it.key})
	println(filteredMap) // ���{Kotlin=92}
	
	// ��ÿ��key-value��ӳ�����ֵ������������ֵ��ɵ�List����
	val mappedList = map.map({"�����${it.key}���塷�۸�Ϊ��${it.value}"})
	// �����[�����Java���塷�۸�Ϊ��86, �����Kotlin���塷�۸�Ϊ��92, �����Go���塷�۸�Ϊ��76]
	println(mappedList)

	// ����key��ȡ���ֵ
	println(map.maxBy({it.key})) // ���Kotlin=92
	// ����value��ȡ��Сֵ
	println(map.minBy({it.value})) // ���Go=76

	var bMap = mapOf("Lua" to 67, "Erlang" to 73, "Kotlin" to 92)
	// ������ӡ��൱�ڲ���
	println(map + bMap) // ���{Java=86, Kotlin=92, Go=76, Lua=67, Erlang=73}
	// �����������ȥ���ǹ�����Ԫ��
	println(map - bMap) // ���{Java=86, Kotlin=92, Go=76}
}