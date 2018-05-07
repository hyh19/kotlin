

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
class User(var name: String? = null, var pass: String? = null)
fun main(args: Array<String>) {
	val user = User()
	// ��Elvis���ʽ��ʹ��throw���ʽ
	// throw���ʽ��ʾ��������쳣�����������Ա�����ֵ
	val th: String = user.name ?: throw NullPointerException("Ŀ�������Ϊnull")
	println(th)

	val s: String = user.name ?: fail("Ŀ�������Ϊnull")
	println(s)
}
fun fail(message: String): Nothing {
	throw IllegalArgumentException(message)
}