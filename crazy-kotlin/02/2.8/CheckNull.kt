

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
	var b: String? = "fkit"
	// ���ж�b��Ϊnull��Ȼ�����b��length����
	var len = if (b != null) b.length else -1
	println("b�ĳ���:${len}")
	b = null
	// ���ж�b��Ϊnull��Ȼ�����b��length����
	if (b != null && b.length > 0) {
		// ����b��length����
		println(b.length)
	}
	else {
		println("���ַ���")
	}
}