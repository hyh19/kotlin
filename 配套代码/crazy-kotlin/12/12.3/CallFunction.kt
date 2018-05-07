

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
import kotlin.reflect.full.*
class Foo{
	fun test(msg: String){
		println("ִ�д�String������test������${msg}")
	}
	fun test(msg: String, price: Double){
		println("ִ�д�String, Double������test������${msg}, ${price}")
	}
}
fun main(args: Array<String>) {
	val clazz = Foo::class
	// ����Foo���ʵ��
	val ins = clazz.createInstance()
	// ��ȡclazz��������ֱ�Ӷ����ȫ������
	val funs = clazz.declaredFunctions
	for (f in funs) {
		// �����������3����������Ӧ2�������ķ�����
		if (f.parameters.size == 3) {
			// ���ô�3�������ĺ���
			f.call(ins, "Kotlin", 78.8)
		}
		// �����������2����������Ӧ1�������ķ�����
		if (f.parameters.size == 2) {
			// ���ô�2�������ĺ���
			f.call(ins, "Kotlin")
		}
	}
}
