

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

fun main(args: Array<String>) {
	var a = 20;
	// �������
	val b = -a;
	// ���÷���
	val c = a.unaryMinus();
	println("b: ${b}, c: ${c}");
	val flag = true
	// �������
	val notFlag1 = !flag
	// ���÷���
	val notFlag2 = flag.not()
	println("notFlag1: ${notFlag1}, notFlag2: ${notFlag2}");
}
