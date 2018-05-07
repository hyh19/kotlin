

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
val db = listOf("Java", java.util.Date(),
	103, 2.3, '我')
//fun <T> findData(clazz: Class<T>): T? {
//	for (ele in db) {
//		if (clazz.isInstance(ele)) {
//			@Suppress("UNCHECKED_CAST")
//			return ele as? T
//		}
//	}
//	return null
//}
// 使用reified修饰泛型形参，使之成为具体化的类型参数
inline fun <reified T> findData(): T? {
	for (ele in db) {
		// 在函数中直接使用T作为普通类型
		if (ele is T) { // ①
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
