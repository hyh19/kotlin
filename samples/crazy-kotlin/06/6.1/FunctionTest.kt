

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
// ����һ������������2���βΣ�����ֵΪInt����
fun max(x:Int , y:Int): Int {
	// ����һ������z���ó�������x��y�нϴ��ֵ
	val z = if (x > y) x else y
	// ���س���z��ֵ
	return z
}
// ����һ������������һ���βΣ�����ֵΪString����
fun sayHi(name: String) : String {
	println("===����ִ��sayHi()����===")
	return "${name}�����ã�"
}
fun main(args: Array<String>){
	var a = 6
	var b = 9
	// ����max()����������������ֵ��ֵ��result����
	var result = max(a , b)  // ��
	println("result:${result}")
	// ����sayHi()������ֱ����������ķ���ֵ
	println(sayHi("�����"))  // ��
}
