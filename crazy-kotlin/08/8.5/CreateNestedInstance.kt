

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
class NestedOut{
	// ����һ��Ƕ���࣬��ʹ�÷��ʿ��Ʒ���Ĭ����public
	open class Nested{
		init{
			println("Ƕ����Ĺ�����")
		}
	}
}
fun main(args: Array<String>) {
	val nested: NestedOut.Nested = NestedOut.Nested()
	/*
	�������ɸ�Ϊ�������д���
	ʹ��OuterClass.NestedClass����ʽ����Ƕ�������
	val nested: NestedOut.Nested
	ͨ������Ƕ���๹��������Ƕ����ʵ��
	nested = NestedOut.Nested()
	*/
}
class NestedSubClass: NestedOut.Nested()