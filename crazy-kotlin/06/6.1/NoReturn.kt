

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
// ����һ���������ú��������βΣ�Ҳ�޷���ֵ
fun foo() {
	println("����ִ��foo()����")
}
// ����һ���������ú���û�з���ֵ����������1���β�
fun sayHi(name: String) : Unit {
	println("====����ִ��sayHi()����====")
	println("${name}����á���ӭ����")
}
// ����һ���������ú���û�з���ֵ����������2���β�
fun showMsg(msg: String , count :Int) {
	for( i in 1 .. count) {
		println(msg)
	}
}
fun main(args: Array<String>) {
	foo()
	sayHi("�����")
	showMsg("��ӭѧϰKotlin" , 3)
}
