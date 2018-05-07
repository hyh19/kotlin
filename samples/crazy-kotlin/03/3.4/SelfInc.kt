

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

data class Data(val x: Int, val y: Int){
	// ΪData�ඨ��һ��inc()����
	operator fun inc(): Data {
		return Data(x + 1, y + 1)
	}
}
// ����չ��������ʽΪData�ඨ��dec()����
operator fun Data.dec(): Data {
	return Data(x - 1, y - 1)
}
fun main(args: Array<String>) {
	var d = Data(4, 10)
	println(d++) // ���á����Լӣ����Data(x=4, y=10)
	println(d) // ����ԼӺ��d��Data(x=5, y=11)
	var dd = Data(9, 20)
	println(--dd) // ���Լ������ã����Data(x=8, y=19)
	println(dd) // ����ԼӺ��dd��Data(x=8, y=19)
}