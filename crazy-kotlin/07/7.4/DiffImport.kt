

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
import java.util.Date
// ����java.sql.Date����ָ������ΪSDate
import java.sql.Date as SDate
fun main(args: Array<String>) {
	// ʹ��java.util.Date
	var d = Date()
	// ʹ��java.sql.Date
	var d2 = SDate(System.currentTimeMillis())
	println(d)
	println(d2)
}