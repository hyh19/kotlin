

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
	var books = setOf("���Android����" , 
		"���iOS����",
		"���Kotlin����")
	// ʹ��for-inѭ��������Set
	// ����book�����Զ�����ÿ��Set���ϵ�Ԫ��
	for( book in books) {
		println(book)
	}
	// ����forEach����������Set����
	books.forEach({println(it)})
	// ����Set���ϵ�����������Set����
	for (i in books.indices) {
		println(books.elementAt(i))
	}
}