

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
	var str = "fkit"
	// ����strת��ΪInt�п���ʧ�ܣ���num�п���û��ֵ
	// ��˲���ʹ��Int������num������
//	var num: Int = str.toIntOrNull()
	var num: Int? = str.toIntOrNull()
	println(num)

	var aStr: String = "fkit"
	var bStr: String? = "fkit"
//	aStr = null // ����aStr������nullֵ
	bStr = null // ��ȷ
	// ����ͨ����aStr������Ϊnull������ʱ�����ܵ���NPE
	println(aStr.length)
	// ���벻��ͨ���������ܵ���NPE
//	println(bStr.length)
}