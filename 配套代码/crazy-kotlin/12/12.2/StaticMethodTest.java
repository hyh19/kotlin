

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class StaticMethodTest{
	public static void main(String[] args){
		// ͨ��INSTANCE����MyObject�ĵ�����ͨ����������test()����
		MyObject.INSTANCE.test();
		// ����test()����ֻ�ǵ��������ʵ������
//		MyObject.test();
		// ͨ��INSTANCE����MyObject�ĵ�����ͨ����������foo()����
		MyObject.INSTANCE.foo();
		// ��ȷ��foo()������@JvmStatic���Σ����Ҳ��MyObject����෽��
		MyObject.foo();
		// ͨ��Companion����MyClass�İ�������ͨ�������������test()����
		MyClass.Companion.test();
		// ����test()����ֻ�ǰ��������ʵ������
//		MyClass.test();
		// ͨ��Companion����MyClass�İ�������ͨ�������������output()����
		MyClass.Companion.output("������");
		// ��ȷ��output()������@JvmStatic���Σ����Ҳ��MyClass����෽��
		MyClass.output("������");
	}
}
