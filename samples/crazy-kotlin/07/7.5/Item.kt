

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
// ʹ������������������
class Item(val code: String, var price: Double){
}
fun main(args: Array<String>) {
	var im = Item("1234567", 6.7)
	println(im.code) // ���"1234567"
	println(im.price) // ���6.7
}