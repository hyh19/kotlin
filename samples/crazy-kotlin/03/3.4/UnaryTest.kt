

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
	// ΪData�ඨ��һ��unaryMinus()����
	operator fun unaryMinus(): Data {
		return Data(-x, -y)
	}
}
// ����չ��������ʽΪData�ඨ��not()����
operator fun Data.not(): Data {
	return Data(-x, -y)
}
fun main(args: Array<String>) {
	val d = Data(4, 10)
	println(-d) // ���Data(x=-4, y=-10)
	println(!d) // ���Data(x=-4, y=-10)
}