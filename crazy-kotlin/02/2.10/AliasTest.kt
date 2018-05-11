

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
class A {
	inner class Inner
}
class B {
	inner class Inner
}
// ΪA.Inner�ڲ���ָ������
typealias AInner = A.Inner
// ΪA.Inner�ڲ���ָ������
typealias BInner = B.Inner

// Ϊ(T) -> Boolean����ָ������Predicate<T>
typealias Predicate<T> = (T) -> Boolean
fun main(args: Array<String>) {
	// ʹ��AInner������������ö���
	var a: AInner = A().AInner()
	// ʹ��BInner������������ö���
	var b = B().BInner()
	// ʹ��Predicate<String>����������ñ�����ֵ��һ��Lambda���ʽ
	val p: Predicate<String> = { it.length > 4 }
	// Ϊfilter()��������p������ֻ�������ȴ���4���ַ���
	println(arrayOf("Java", "Objective-C", "Go", "Kotlin").filter(p))
}