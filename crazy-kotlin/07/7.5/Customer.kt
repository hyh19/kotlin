

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
class Customer(val name: String = "����", 
	var addr: String = "���"){
}
fun main(args: Array<String>) {
	// �����в�������������
	var ct = Customer("�����", "����ɽ")
	println(ct.name) // ���"�����"
	println(ct.addr) // ���"����ɽ"
	// �Թ��������Ĭ��ֵ���ù�����������ȥ������޲εĹ�����
	var ctm = Customer()
	println(ctm.name) // ���"����"
	println(ctm.addr) // ���"���"
}