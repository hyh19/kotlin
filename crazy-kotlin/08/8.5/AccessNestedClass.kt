

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
class AccessNestedClass{
	class NestedClass{
		var prop = 9
	}
	fun accessNestedProp(){
		// println(prop)
		// ���������ִ���Ӧ��Ϊ������ʽ
		// ͨ���������Ƕ����ĳ�Ա
		println(NestedClass().prop)
	}
}
