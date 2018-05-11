

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
val db = listOf("Java", java.util.Date(),
	103, 2.3, '��')
//fun <T> findData(clazz: Class<T>): T? {
//	for (ele in db) {
//		if (clazz.isInstance(ele)) {
//			@Suppress("UNCHECKED_CAST")
//			return ele as? T
//		}
//	}
//	return null
//}
// ʹ��reified���η����βΣ�ʹ֮��Ϊ���廯�����Ͳ���
inline fun <reified T> findData(): T? {
	for (ele in db) {
		// �ں�����ֱ��ʹ��T��Ϊ��ͨ����
		if (ele is T) { // ��
			return ele
		}
	}
	return null
}

fun main(args: Array<String>) {
//	println(findData(Integer::class.java))
//	println(findData(java.lang.Double::class.java))
	println(findData<Int>())
	println(findData<Double>())
}

inline fun <reified T> membersOf() = T::class.members
