

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
	// �������count
	var count = 1
	// ִ��do whileѭ��
	do {
		println(count)
		// ѭ���������
		count++
		// ѭ����������while�ؼ���
	} while (count < 10)
	println("ѭ������!")

	// �������count2
	var count2 = 20
	// ִ��do whileѭ��
	do
		// ���д����ѭ����͵������ֺϲ�����һ�д���
		println(count2++)
	while (count2 < 10)
	println("ѭ������!")

}
