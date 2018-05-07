

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
	// �ж��Ƿ�����Ԫ�صĳ��ȴ���4
	println(set.all({it.length > 4})) // ���false
	// �ж��Ƿ���һԪ�صĳ��ȴ���4
	println(set.any({it.length > 4})) // ���true
	// ��lambda���ʽ��ֵΪkey������Ԫ��Ϊvalue�����Map����
	val map = set.associateBy({"�����" + it + "���塷"})
	// �����{�����Java���塷=Java, �����Kotlin���塷=Kotlin, �����Go���塷=Go}
	println(map)


	// ������contains()���������Կ���in��!in�����
	println("Java" in set) // ���true
	println("Go" !in set) // ���false

	// ����ɾ��Set����ǰ��2��Ԫ�غ�ļ���
	val dropedList = set.drop(2)
	println(dropedList) // ���[Go]

		
	// ��Set����Ԫ�ؽ��й��ˣ�Ҫ�󼯺�Ԫ�ذ���li
	val filteredList = set.filter({"li" in it})
	println(filteredList) // ���[Kotlin]
	
	// ����Set����Ԫ���а���li��Ԫ�أ�����ҵ��ͷ��ظ�Ԫ�أ����򷵻�null
	val foundStr1 = set.find({"li" in it})
	println(foundStr1) // ���Kotlin
	// ����Set����Ԫ���а���gang��Ԫ�أ�����ҵ��ͷ��ظ�Ԫ�أ����򷵻�null
	val foundStr2 = set.find({"gang" in it})
	println(foundStr2) // ���null
	// ��Set�����������ַ���ƴ����һ��
	val foldedList = set.fold("", {acc, e -> acc + e})
	println(foldedList) // ���JavaKotlinGo

	// ����ĳ��Ԫ�صĳ���λ��
	println(set.indexOf("Go")) // ���2

	// ��ÿ������Ԫ��ӳ�����ֵ������������ֵ��ɵ�List����
	val mappedList = set.map({"�����" + it + "���塷"})
	// �����[�����Java���塷, �����Kotlin���塷, �����Go���塷]
	println(mappedList)

	// ��ȡ���ֵ
	println(set.max()) // ���Kotlin
	// ��ȡ��Сֵ
	println(set.min()) // ���Go
	// ��ת����˳��
	val reversedList = set.reversed()
	println(reversedList) // ���[Go, Kotlin, Java]

	var bSet = setOf("Lua", "Erlang", "Kotlin")
	// �����������ϵĽ���
	println(set intersect bSet) // ���[Kotlin]
	// �����������ϵĲ���
	println(set union bSet) // ���[Java, Kotlin, Go, Lua, Erlang]
	// ������ӡ��൱�ڲ���
	println(set + bSet) // ���[Java, Kotlin, Go, Lua, Erlang]
	// �����������ȥ���ǹ�����Ԫ��
	println(set - bSet) // ���[Java,  Go]
}