

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
	var fis: FileInputStream? = null
	try {
		fis = FileInputStream("a.txt")
	} catch (ioe: IOException) {
		println(ioe.message)
		// return���ǿ�Ʒ�������
		return       // ��
		// ʹ��exit�˳������
		// System.exit(1)     // ��
	} finally {
		// �رմ����ļ���������Դ
		fis?.close()
		println("ִ��finally�������Դ����!")
	}
}