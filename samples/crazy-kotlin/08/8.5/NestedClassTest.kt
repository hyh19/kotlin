

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
class NestedClassTest{
	var prop1 = 5
	fun test(){
		println("�ⲿ���test()����")
	}
	// û��inner���η�����Ƕ���ࣨ�൱��Java�ľ�̬�ڲ��ࣩ
	class NestedClass{
		fun accessOuterMember(){
			// ������һ��Ƕ����������ġ�
			val a = A()
			// �������д��붼����ִ���
			println(prop1)
			test()
		}
	}
	class A
}
