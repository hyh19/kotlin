

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
	// ����һ��Short���ͱ���
	var sValue: Short = 5
	// ���ʽ�е�sValue���Զ�������Int���ͣ����ұߵı��ʽ����ΪInt
	// ��һ��Int����ֵ����Short���ͱ�������������
//	sValue = sValue - 2


	var b: Byte = 40
	var c: Short = 97
	var i: Int = 23
	var d: Double = .314
	// �ұ߱��ʽ����ߵȼ�������Ϊd��Double���ͣ�
	// ���ұ߱��ʽ������ΪDouble����,result�����ƶ�ΪDouble����
	val result = b + c + i * d
	// �����144.222
	println(result)


	var iVal: Int = 3
	// �ұ߱��ʽ����������������Int���ͣ����ұ߱��ʽ������ΪInt
	// ��Ȼ23/3���ܳ���������Ȼ�õ�һ��Int��������
	val intResult = 23 / iVal;
	println(intResult) // �����7

	// ����ַ���Hello!a7
	println("Hello!" + 'a' + 7)
	// ����ַ���hHello!
	println('a' + 7 + "Hello!")

}