

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
	var a: Any = "fkit"
	// ֱ�ӷ���a��length���ԣ�����������
	// ����a�ǵı���ʱ������Any����˱���ʱ��û��length����
//	println(a.length)
	// ���ж�aΪString��if����������a���Զ�תΪString����
	if (a is String) println(a.length)
	test(a)
	when(a) {
		// �������÷�֧������a��String���ͣ��ɵ���String�ķ���
		is String -> println(a.length)
		// �������÷�֧������a��Int���ͣ��ɵ���Int�ķ���
		is Int -> println(a.toDouble())
	}

	// �ܽ���&&֮��ı��ʽ������a��String����
	// �����&&֮��ɵ���a��length����
	if (a is String && a.length > 3) {
		println("a�ĳ��ȴ���3")
	}
	foo(a)
}
fun test(x: Any){
	// ���x����String����������
	if (x !is String) return
	// ������²��֣�x�ᱻ�Զ�תΪString
	println("x�ĳ���Ϊ��${x.length}")
}
fun foo(x: Any){
	// �ܽ���||֮��ı��ʽ������a��String����
	// �����||֮��ɵ���a��length����
	if (x !is String || x.length == 0)
		return
	// ���²���x�ᱻ�Զ�תΪString
	println("x�ĳ���Ϊ��${x.length}")
}