

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
	// ͨ��Gender��valueOf()��������ö������ȡö��ֵ
	val g = Gender.valueOf("FEMALE")
	// ����ö��ֵ��cnName����
	println("${g}����:${g.cnName}")
	// ����info����
	g.info()
}