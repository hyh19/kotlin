

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
	var len1 = if (b != null) b.length else -1
	println(len1);
	b = null
	// ʹ��Elvis�����
	var len2 = b?.length ?: -1
	println(len2);
}
fun test(str: String!) {
	return str?.length ?: -
}