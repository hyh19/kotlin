

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
	val bookPrice = 79
	// �ַ���ģ����Ƕ�����
	var s = "ͼ��۸��ǣ�${bookPrice}"
	println(s)
	val rand = java.util.Random() // ����Java��Random����
	// �ַ���ģ����Ƕ�뷽������
	var s2 = "α������ǣ�${rand.nextInt(10)}"
	println(s2)
	val myStr = "fkjava.org"
	println("${myStr}�ĳ�����${myStr.length}")
	var bookName = "���Kotlin����"
	val poem = """
		|ͼ������${bookName},
		|ͼ��۸���${bookPrice},
		|�����������${rand.nextInt(10) + 50}
	""".trimMargin()
	println(poem)
}
