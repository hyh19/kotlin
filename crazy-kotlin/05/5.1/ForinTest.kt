

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
	var books = arrayOf("������Java EE��ҵӦ��ʵս" , 
		"���Java����",
		"���Android����")
	// ʹ��for-inѭ������������Ԫ��
	// ����book�����Զ�����ÿ������Ԫ��
	for (book in books) {
		println(book)
	}
	var i = java.util.Random().nextInt(10)
	// ���i�Ƿ�λ��books���������������
	println( i in books.indices) // i >=0 && i < books.size
	println( books.lastIndex) // ���2
	println( books.size - 1 == books.lastIndex) // ���true
}
