

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
open class PrivateFinalMemberTest{
	// ��ʵ���淽��������ʹ��private���η��Ƕ���
	private final fun test(){}
	private final var name: String = "��������"
}
class Sub: PrivateFinalMemberTest(){
	// ����ķ������岻���������
	public fun test(){}
	public var name: String = "��������"
}
