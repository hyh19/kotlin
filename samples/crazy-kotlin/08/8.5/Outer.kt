

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
class Outer{
	private val outProp = 9
	inner class Inner{
		val inProp = 5
		fun acessOuterProp(){
			// �ڲ������ֱ�ӷ����ⲿ���private����
			println("�ⲿ���outPropֵ:${outProp}")
		}
	}
	fun accessInnerProp(){
		// �ⲿ�಻��ֱ�ӷ����ڲ��������
		// ���������ֱ������
//		println("�ڲ����inPropֵ:${inProp}")
		// ��������ڲ�������ԣ�������ʽ�����ڲ������
		println("�ڲ����inPropֵ: ${Inner().inProp}")
	}
}
fun main(args: Array<String>) {
	// ִ��������룬ֻ�������ⲿ����󣬻�δ�����ڲ������
	val ot = Outer()  // ��
	ot.accessInnerProp()
}