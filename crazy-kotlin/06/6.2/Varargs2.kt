

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

// �������βθ����ɱ�ĺ���
fun test(vararg books : String , num: Int) {
    // books���������鴦��
    for (i in books.indices) {
        println(books[i])
    }
    println(num)
}
fun main(args: Array<String>) {
	// ����test()����
	test("���iOS����", "���Android����", num = 20)
	var arr = arrayOf("���Kotlin����", "���Java����")
	// ������Ķ��Ԫ�ش��������ɱ�Ĳ���
	test(*arr, num = 20)
}