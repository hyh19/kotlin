

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
// ���������ε�����
class Triangle(color: String, var a: Double, 
	var b: Double, var c: Double): Shape(color){
	fun setSides(a: Double, b: Double, c: Double){
		if (a >= b + c || b >= a + c || c >= a + b){
			println("����������֮�ͱ�����ڵ�����")
			return
		}
		this.a = a
		this.b = b
		this.c = c
	}
	// ��дShape��ļ����ܳ��ĳ��󷽷�
	override fun calPerimeter(): Double{
		return a + b + c
	}
	// ��дShape��Ĵ�����״�ĳ�������
	override val type: String = "������"
}
