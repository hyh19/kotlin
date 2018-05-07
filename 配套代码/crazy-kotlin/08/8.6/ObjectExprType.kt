

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
class ObjectExprType{
	private val ob1 = object {
		val name: String = "fkit"
	}
	internal val ob2 = object {
		val name: String = "fkit"
	}
	private fun privateBar() = object {
		val name: String = "fkjava.org"
	}
	fun publicBar() = object {
		val name: String = "fkjava.org"
	}
	fun test(){
		// ob1��private������ʽ����������ʶ��������ʵ����
		// ���������ȷ
		println(ob1.name)
		// ob2�Ƿ�private������ʽ��������������Any����
		// ����������
//		println(ob2.name)
		// privateBar��private��������������ʶ�������صĶ�����ʽ����ʵ����
		// ���������ȷ
		println(privateBar().name)
		// publicBar�Ƿ�private�������������������صĶ�����ʽ����Any����
		// ����������
//		println(publicBar().name)
	}
}
fun main(args: Array<String>) {
	ObjectExprType().test()
}