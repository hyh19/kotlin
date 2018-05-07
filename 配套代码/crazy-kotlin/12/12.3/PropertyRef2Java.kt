

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
import kotlin.reflect.*
import kotlin.reflect.full.*
import kotlin.reflect.jvm.*
class Item{
	var name: String = "���Kotlin����"
	val price: Double = 76.6
}
var foo = "��������"
fun main(args: Array<String>) {
	// ��ȡfoo���ԣ�����KMutableProperty0��ʵ��
	val topProp = ::foo
	println(topProp.javaField) // ��ȡĻ���ֶ�
	println(topProp.javaGetter) // ��ȡgetter����
	println(topProp.javaSetter)	// ��ȡsetter����

	// ��ȡItem��name���ԣ�����KMutableProperty1��ʵ��
	val mp = Item::name
	println(mp.javaField) // ��ȡĻ���ֶ�
	println(mp.javaGetter) // ��ȡgetter����
	println(mp.javaSetter)	// ��ȡsetter����

	// ��ȡItem��name���ԣ�����KProperty1��ʵ��
	val prop = Item::price
	println(prop.javaField) // ��ȡĻ���ֶ�
	println(prop.javaGetter) // ��ȡgetter����
}