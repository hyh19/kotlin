

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
open class BaseClass{
	open var book = 6
	fun base(){
		println("�������ͨ����")
	}
	open fun test(){
		println("����ı����ǵķ���")
	}
}
class SubClass: BaseClass(){
	// ��д���������
	override var book = 60
	// ��д����ķ���
	override fun test(){
		println("����ĸ��Ǹ���ķ���")
	}
	fun sub(){
		println("�������ͨ����")
	}
}
fun main(args: Array<String>) {
	// �������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
	var bc: BaseClass = BaseClass()
	// ��� 6
	println(bc.book)
	// �������ε��ý�ִ��BaseClass�ķ���
	bc.base()
	bc.test()
	// �������ʱ���ͺ�����ʱ������ȫһ������˲����ڶ�̬
	var sc: SubClass = SubClass()
	// ��� 60
	println(sc.book)
	// ������ý�ִ�дӸ���̳е���base()����
	sc.base()
	// ������ý�ִ�е�ǰ���test()����
	sc.test()
	// �������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
	var ploymophicBc: BaseClass = SubClass()
	// ���60 ���� �������ʵ���Ȼ��������������
	println(ploymophicBc.book)
	// ������ý�ִ�дӸ���̳е���base()����
	ploymophicBc.base()
	// ������ý�ִ�е�ǰ���test()����
	ploymophicBc.test()
	// ��ΪploymophicBc�ı���ʱ������BaseClass
	// BaseClass��û���ṩsub()��������������������ʱ����ִ���
//	ploymophicBc.sub()
}