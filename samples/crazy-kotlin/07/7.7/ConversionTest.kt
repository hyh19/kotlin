

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
	val obj: Any = "Hello"
	// obj�����ı���ʱ����ΪAny��Any��String���ڼ̳й�ϵ�����Խ���ת��
	// ����objʵ�����õ�ʵ����String���ͣ���������ʱҲ��ͨ��
	val objStr = obj as String
	println(objStr)
	// ����һ��objPri����������ʱ����ΪAny��ʵ������ΪInt
	val objPri: Any = 5
	// objPri�����ı���ʱ����ΪAny��objPri������ʱ����ΪInt
	// Any��String���ڼ̳й�ϵ�����Խ���ת��������ͨ��
	// ��objPri����ʵ�����õ�ʵ����Int���ͣ�����ת��ʧ��
	val str: String = objPri as String  // ת��ʧ��
	val fkit = "fkit.org"
	val s: String = "Kotlin"
	// s�����ı���ʱ����ΪString��s������ʱ����ΪString
	// ��String��Number�����ڼ̳й�ϵ����˱��뱨���棺ת�������ܳɹ�
	val num: Number = s as Number  // ���棺ת�������ܳɹ�
}