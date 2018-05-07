

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
fun copy(from: Array<out Any>, to: Array<Any>) {
	val len = if(from.size < to.size) from.size else to.size
	for (i in 0 until len) {
		to[i] = from[i]
	}
}
fun main(args: Array<String>) {
	var arr1 = arrayOf(2, 3, 15, 26)
	var arr2: Array<Any> = arrayOf(4, 13, 25, 74, 34)
	copy(arr1, arr2)  // ��
	println(arr2.contentToString())

	var numArr: Array<out Number> = arrayOf(2, 5, 1.2, 4.3) 
	println(numArr.contentToString())
	numArr.set(0, 3.4)  // ��
	var intArr: Array<Int> = arrayOf(3, 4, 5)
	numArr = intArr; // �ۣ�Array��֧���������ͱ䣬�������
	println(numArr.contentToString())
}