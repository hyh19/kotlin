

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
	println(5 and 9) // �����1
	println(5 or 9) // �����13

	println((-5).inv()) // �����4
	println(5 xor 9) // �����12

	println(5 shl 2) // ���20
	println(-5 shl 2) // ���-20

	// ���-2
	println(-5 shr 2)
	// ���1073741822
	println(-5 ushr 2)

}