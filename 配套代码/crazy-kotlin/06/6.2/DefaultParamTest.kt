

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
// Ϊ��������ָ��Ĭ��ֵ
fun sayHi(name: String = "�����", 
	message: String = "��ӭ����������"){
	println("${name} , ����")
	println("��Ϣ�ǣ�${message}")
}
fun main(args: Array<String>) {
	// ȫ��ʹ��Ĭ�ϲ���
	sayHi()
	// ֻ��message����ʹ��Ĭ��ֵ
	sayHi("�׹Ǿ�")
	// ������������ʹ��Ĭ��ֵ
	sayHi("�׹Ǿ�", "��ӭѧϰKotlin")
	// ֻ��name����ʹ��Ĭ��ֵ
	sayHi(message = "��ӭѧϰKotlin")

//sayHi(name="�׹Ǿ�", "��ӭѧϰKotlin")
//sayHi("��ӭѧϰKotlin" , name="�׹Ǿ�")

sayHi("�׹Ǿ�", message="��ӭѧϰKotlin")
sayHi(name="�׹Ǿ�", message="��ӭѧϰKotlin")

}
