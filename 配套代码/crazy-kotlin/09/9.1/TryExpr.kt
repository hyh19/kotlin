

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
	val input = readLine()
	// ��try���ʽ�Ա���a��ֵ
	val a: Int? = try {Integer.parseInt(input) } catch (e: NumberFormatException) { null }
	println(a)
}