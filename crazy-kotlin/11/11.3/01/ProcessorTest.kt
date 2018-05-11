

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
inline fun <reified T: Any> processTestable() {
	var passed = 0
	var failed = 0
	val target = T::class.createInstance<T>()
	// ����T��Ӧ����������з���
	for (m in T::class.functions) {
		// ����÷���ʹ����@Testable����
		if (m.findAnnotation<Testable>() != null){
			try {
				// ����m����
				m.call(target)
				// ���Գɹ���passed��������1
				passed++
			}catch (ex: Exception){
				println("����" + m + "����ʧ�ܣ��쳣��" 
					+ ex.cause)
				// ���Գ����쳣��failed��������1
				failed++
			}
		}
	}
	// ͳ�Ʋ��Խ��
	println("��������:" + (passed + failed) 
		+ "�����������У�\n" + "ʧ����:" + failed + "����\n"
		+ "�ɹ���:" + passed + "����")
}
fun main(args: Array<String>){
	// ����MyTest��
	processTestable<MyTest>()
}