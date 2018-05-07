

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
class Item{
	var name: String = "���Kotlin����"
	val price: Double = 76.6
}
fun main(args: Array<String>) {
	val clazz = Item::class
	val ins = clazz.createInstance()
	val props = clazz.declaredMemberProperties
	props.forEach {
		when (it.name) {
			"name" -> {
				@Suppress("UNCHECKED_CAST")
				// ������ת��Ϊ��д����
				val mp = it as KMutableProperty1<Item, Any>
				// �޸�����ֵ
				mp.set(ins, "���Java����")
				println(it.get(ins))
			}
			"price" -> {
				// ֻ�����ԣ�ֻ��ͨ��get()������ȡ����ֵ
				println(it.get(ins))
			}
		}
	}
}