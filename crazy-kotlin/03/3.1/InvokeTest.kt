

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	val s = "java.lang.String"
	// ʹ�÷����ȡString���length()����
	val mtd = Class.forName(s).getMethod("length")
	// ʹ�ô�ͳ������ʹ��Method�����invoke()����
	println(mtd.invoke("java"))
	// ʹ�õ��������
	println(mtd("java"))
}
