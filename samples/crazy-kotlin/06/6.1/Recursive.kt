

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
fun fn(n:Int) : Int {
	if (n == 0) {
		return 1
	}
	else if (n == 1) {
		return 4
	}
	else {
		// �����е������������Ǻ����ݹ�
		return 2 * fn(n - 1) + fn(n - 2)
	}
}
fun main(args: Array<String>) {
	// ���fn(10)�Ľ��
	println("fn(10)�Ľ����:${fn(10)}")
}


