

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
	// ���ѭ����outer��Ϊ��ʶ��
	outer@ for (i in 0 until 5 ) {
		// �ڲ�ѭ��
		for (j in 0 until 3 ) {
			println("i��ֵΪ:${i}, j��ֵΪ:${j}")
			if (j == 1) {
				// ����outer��ǩ����ʶ��ѭ��
				break@outer
			}
		}
	}
}