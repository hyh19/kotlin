

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
class A{
	fun bar() = println("A��bar����")
}
class B{
	fun baz() = println("B��baz����")
	// �Գ�Ա�ķ�ʽΪA��չfoo()����
	fun A.foo(){
		// �ڸ÷����ڼȿɵ�����A�ĳ�Ա��Ҳ�ɵ�����B�ĳ�Ա
		bar() // A����Ϊ��ʽ������
		baz() // B����Ϊ��ʽ������
	}
	fun test(target: A){
		// ����A����ĳ�Ա����
		target.bar()
		// ����A�������չ����
		target.foo()
	}
}
fun main(args: Array<String>) {
	var b = B()
	b.test(A())
}