

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
	// �������ɱ伯��,����ֵ��List
	var list = listOf("Java", "Kotlin", null, "Go")
	for (i in list.indices ) {
		// ʹ��[]��������ʼ���Ԫ�أ�ʵ���Ͼ��Ǹ���get��������
		println(list[i])
	}
	// ��ȡָ��Ԫ�صĳ���λ��
	println(list.indexOf("Kotlin")) // ���1
	// ��ȡList���Ӽ���
	println(list.subList(1, 3)) // ���["Kotlin", null]
}
