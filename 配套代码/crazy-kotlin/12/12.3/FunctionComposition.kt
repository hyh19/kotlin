

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
fun abs(d: Double): Double = if (d < 0) -d else d
fun sqrt(d: Double): Double = java.lang.Math.sqrt(d)
// ����һ��comp()�������ú������ڽ����������������
fun comp(fun1: (Double) -> Double, fun2: (Double) -> Double) :
	(Double) -> Double{
	return { x -> fun2(fun1(x)) }
}
fun main(args: Array<String>) {
	println(abs(-3.2))
	// ��::abs��::sqrt�������
	val f = comp(::abs, ::sqrt)
	println(f(-25.0))
}