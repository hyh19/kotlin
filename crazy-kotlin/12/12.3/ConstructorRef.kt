

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
class Foo(var name: String = "δ֪")
// test�����Ĳ�����(String)->Foo���ͣ������Foo��String���������������ͣ�
fun test(factory: (String) -> Foo) {
	val x: Foo = factory("���Kotlin����")
	println(x.name)
}
fun main(args: Array<String>) {
	// ͨ��::Foo����Foo�����������
	test2(::Foo)
}