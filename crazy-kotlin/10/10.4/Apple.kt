

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
class Apple<T: Number>{
	var col: T
	constructor(col: T){
		this.col = col
	}
}
fun main(args: Array<String>) {
	// ��ʽָ�����ͺ�����T��Int����
	var ai = Apple<Int>(2)
	// ��ʽָ�����ͺ�����T��Double����
	var ad: Apple<Double> = Apple(3.3)
	// ������뽫���������쳣�����������ͼ��String���ʹ���T�β�
	// ��String����Number�������ͣ���������������
//	var ap: Apple<String> = Apple("Kotlin")	// ��
	// ��ʽָ�����ͺ�����T��Int���ͣ�Int��Number��������
	println(sum<Int>(2, 4, 5))
	// ϵͳ�ƶ�TΪDouble����, Double��Number��������
	println(sum(1.2, 4.4, 5.6))
}
fun <T: Number> sum(vararg params: T): Double{
	var sum = 0.0
	for (p in params) {
		sum += p.toDouble()
	}
	return sum
}
