

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
	// ����һ�����ַ���
	var result = "";
	// ����6��ѭ��
	for(i in 0..5) {
		// ����һ��97��122֮���Int��������
		val intVal = (Math.random() * 26 + 97).toInt();
		// ��intValueǿ��ת��ΪChar���ͺ����ӵ�result����
		result = result + intVal.toChar();
	}
	// �������ַ���
	println(result);
}