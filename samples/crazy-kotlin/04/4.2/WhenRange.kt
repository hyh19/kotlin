

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
fun main(args: Array<String>){
	val age = java.util.Random().nextInt(100)
	println(age)
	// ʹ��when���ʽ��str��ֵ
	var str = when (age){
		in 10..25 -> "��ʱ����������"
		in 26..50 -> "�羰��ϡ��ȥ��"
		in 51..80 -> "��������ʤ����"
		else -> "����"
	}
	println(str)
}
