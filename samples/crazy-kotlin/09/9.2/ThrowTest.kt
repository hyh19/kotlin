

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
	// ���Ǹ��쳣��Java���Ƿ�Ϊchecked�쳣��
	// ��Kotlin�и��쳣������checked�쳣
	throwChecked(-3)
	throwRuntime(3)
}
fun throwChecked(a: Int) {
	if (a > 0) {
		// �����׳���ͨ�쳣����Kotlin��Ҳ����checked�쳣
		// �ô��벻�ش���try���Ҳ���ش��ڴ�throws�����ķ�����
		throw Exception("a��ֵ����0��������Ҫ��")
	}
}
fun throwRuntime(a: Int) {
	if (a > 0) {
		throw RuntimeException("a��ֵ����0��������Ҫ��")
	}
}

