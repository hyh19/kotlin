

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
	// ѭ���ĳ�ʼ������
	var count = 0
	// ��countС��10ʱ��ִ��ѭ����
	while (count < 10) {
		println("count:${count}")
		// �������
		count++
	}
	println("ѭ������!")

	// ������һ����ѭ��
	var count2 = 0
	while (count2 < 10) {
		print("��ִͣ�е���ѭ�� ${count2}")
		count2--
	}
	println("��Զ�޷�������ѭ����")
}