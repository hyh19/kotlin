

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
fun test(msg: String) {
	println("ֻ��һ���ַ���������test()���� ${msg}")
}
// ��Ϊǰ���Ѿ����˴�һ���ַ���������test()����
// �˴��ĸ����ɱ��β��ֿ��԰�����һ���ַ�����������ʽ
fun test(vararg books: String) {
	println("****�βθ����ɱ��test()����**** ${books.contentToString()}")
}

fun main(args: Array<String>) {
	// �������ε��ý�ִ�еڶ���test()����
	test()
	test("aa" , "bb")
	test("aa")  // ��
}