

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
class A1: Apple<String>(){
	// ��ȷ��д�˸�������ԣ���������
	// �븸��Apple<String>������������ȫ��ͬ
	override var info: String? = null
		get() = "����" + super.info
	/*
	// ���淽���Ǵ���ģ���д���෽��ʱ����ֵ���Ͳ�һ��
	override var info: Object? = null
	*/
}
