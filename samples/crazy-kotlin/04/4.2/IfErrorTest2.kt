

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
	var age = 45
	if (age > 20) {
		println("������")
	}
	// ��ԭ����if������������else����������
	if (age > 40 && !(age > 20)) {
		println("������")
	}
	// ��ԭ����if������������else����������
	if (age > 60 && !(age > 20) && !(age > 40 && !(age > 20))) {
		println("������")
	}
}
