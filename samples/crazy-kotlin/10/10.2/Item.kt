

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
class Item<in T>{
	fun foo(t: T){
		println(t)
	}
}
fun main(args: Array<String>) {
	// ��ʱT��������Any
	var item = Item<Any>()
	item.foo(20)
	var im2: Item<String> = item
	// im2��ʵ��������Item<Any>���������foo����ֻҪ��Any����
	// ������������im2������ΪItem<String>��
	// ��˴������ֻ������String����˳���϶��ǰ�ȫ��
	im2.foo("Kotlin") // ��
}
