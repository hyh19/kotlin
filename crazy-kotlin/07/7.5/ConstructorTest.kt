

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
// �ṩ�����������ù�����������������
class ConstructorTest(name: String, count: Int){
	var name: String
	var count: Int
	// �����ʼ���飬�൱������������ִ����
	init {
		// ��ʼ�������this���������г�ʼ���Ķ���
		// �������д��뽫�����2����������this��������name��count����
		this.name = name
		this.count = count
	}
}
fun main(args: Array<String>) {
	// ʹ���Զ���Ĺ���������������
	// ϵͳ����Ըö���ִ���Զ���ĳ�ʼ��
	var tc = ConstructorTest("���Java����" , 90000)
	// ���ConstructorTest�����name��count��������
	println(tc.name)
	println(tc.count)
}