

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
	println(b!!.length) // ���4
	b = null
	println(b!!.length) // ���null

	// ����һ��Ԫ�ؿɿյ�����
	val myArr: Array<String?> = arrayOf("fkit", "fkjava", null, "crazyit")
	for (item in myArr) {
		// ��item��Ϊnullʱ�ŵ���let����
		item!!.let { println(it) }
	}
}