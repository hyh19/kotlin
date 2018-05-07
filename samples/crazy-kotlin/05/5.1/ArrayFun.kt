

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
	// ����һ������
	var arr = arrayOf(2, 4, 5, 6)
	// �ж��Ƿ�����Ԫ�ص�ƽ��������20
	println(arr.all({it * it > 20})) // ���false
	// �ж��Ƿ���һԪ�ص�ƽ������20
	println(arr.any({it * it > 20})) // ���true
	// ��������Ԫ��������<K,V>�ԣ���������<K,V>����ɵ�Map����
	// �����㷨�����ǣ�K������Ԫ��+2��V������Ԫ�ص�ƽ��
	var result1 = arr.associate({it + 10 to it * it})
	println(result1)
	// ����һ���ɱ�Map���ϣ�����׷�Ӹ�������������Key-Value��
	var map = mutableMapOf(1 to 100, 2 to 120, -1 to 130)
	// ���������Key��Ԫ�ص�ƽ��)��Value��Ԫ�أ�����ӵ�map������
	arr.associateByTo(map, {it * it})
	println(map)
	// ������������Ԫ�ص��ܺ�
	println(arr.fold(0 , {acc, e -> acc + e})) // ���17

	// ����һ��a����
	var a = arrayOf(3, 4 , 5, 6)
	// ����һ��a2����
	var a2 = arrayOf(3, 4 , 5, 6)
	// a�����a2����ĳ�����ȣ�ÿ��Ԫ��������ȣ������true
	println("a�����a2�����Ƿ���ȣ�${a.contentEquals(a2)}")
	// ͨ������a���飬����һ���µ�b����
	var b = a.copyOf(6)
	println("a�����b�����Ƿ���ȣ�${a.contentEquals(b)}")
	// ���b�����Ԫ�أ������[3, 4, 5, 6, null, null]
	println("b�����Ԫ��Ϊ��${b.contentToString()}")
	// ��b����ĵ�5��Ԫ�أ�����������7��Ԫ�أ�����������ֵΪ1
	b.fill(1, 4, 6)
	// ���b�����Ԫ�أ������[3, 4, 5, 6, 1, 1]
	println("b�����Ԫ��Ϊ��${b.contentToString()}")
	// ��b�����������
	b.sort()
	// ���b�����Ԫ�أ������[1, 1, 3, 4, 5, 6]
	println("b�����Ԫ��Ϊ��${b.contentToString()}")

	var c = arrayOf("Java", "Go", "Kotlin")
	var d = arrayOf("Lua", "Kotlin", "Python")
	println((c + d).contentToString()) // �����������ϵĲ���
	println("Java" in c) // ���true
}