
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
import java.io.*
fun main(args: Array<String>) {
	try {
		val fis = FileInputStream("a.txt")
		println(fis.read())
	} catch(e: Exception) {
		println("��ȡ�ļ������쳣")
	}
}