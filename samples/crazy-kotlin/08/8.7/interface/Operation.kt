

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
enum class Operation{
	PLUS {
		override fun eval(x: Double, y: Double) = x + y
	},
	MINUS {
		override fun eval(x: Double, y: Double) = x - y
	},
	TIMES {
		override fun eval(x: Double, y: Double) = x * y
	},
	DIVIDE {
		override fun eval(x: Double, y: Double) = x / y
	};
	// Ϊö���ඨ��һ�����󷽷�
	// ������󷽷��ɲ�ͬ��ö��ֵ�ṩ��ͬ��ʵ��
	abstract fun eval(x: Double, y: Double): Double
}
fun main(args: Array<String>) {
	println(Operation.PLUS.eval(3.0, 4.0))
	println(Operation.MINUS.eval(5.0, 4.0))
	println(Operation.TIMES.eval(5.0, 4.0))
	println(Operation.DIVIDE.eval(5.0, 4.0))
}