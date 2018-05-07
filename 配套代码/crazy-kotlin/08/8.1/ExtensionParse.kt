

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
// ����һ��Base��
open class Base
// ����Sub��̳�Base��
class Sub: Base()
// ΪBase����չfoo����
fun Base.foo() = println("Base��չ��foo()����")
// ΪSub����չfoo����
fun Sub.foo() = println("Sub��չ��foo()����")
// ����һ������
fun invokeFoo(b: Base) {
	// ����Base�����foo()����
	b.foo()
}
fun main(args: Array<String>) {
	// �������Sub����
	invokeFoo(Sub())
	val bb: Base = Sub()
	bb.foo();
}
