

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
class DiscernVariable{ // ��ʽ��ǩ @DiscernVariable
	private val prop = "�ⲿ�������"
	inner class InClass {  // ��ʽ��ǩ @InClass
		private val prop = "�ڲ��������"
		fun info(){
			val prop = "�ֲ�����"
			// ͨ���ⲿ������.this.varName �����ⲿ�������
			println("�ⲿ�������ֵ��${this@DiscernVariable.prop}")
			// ͨ�� this.varName �����ڲ��������
			println("�ڲ��������ֵ��${this.prop}")
			// ֱ�ӷ��ʾֲ�����
			println("�ֲ�������ֵ��${prop}")
		}
	}
	fun test(){
		val ic = InClass()
		ic.info()
	}
}
fun main(args: Array<String>) {
	DiscernVariable().test()
}