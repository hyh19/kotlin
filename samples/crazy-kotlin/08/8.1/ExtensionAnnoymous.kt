

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
// ����һ���������ߵ���������
val factorial: Int.()->Int = fun Int.(): Int{
	// �����������Ľ�������Int����
	// ��˸�����������this�����˵��ø�����������Int����
	if (this < 0) {
		return -1
	} else if(this == 1){
		return 1
	} else {
		var result = 1
		for (i in 1 .. this ) {
			result *= i
		}
		return result
	}
}
fun main(args: Array<String>) {
	println(6.factorial())
}