

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
class Circle(color: String, var radius: Double): Shape(color){
	// ��дShape��ļ����ܳ��ĳ��󷽷�
	override fun calPerimeter(): Double = 2 * Math.PI * radius
	// ��дShape��Ĵ�����״�ĳ�������
	override val type: String = "Բ��"
}
fun main(args: Array<String>){
	var s1: Shape = Triangle("��ɫ" , 3.0 , 4.0, 5.0)
	var s2: Shape = Circle("��ɫ" , 3.0)
	println(s1.type)
	println(s1.calPerimeter())
	println(s2.type)
	println(s2.calPerimeter())
}