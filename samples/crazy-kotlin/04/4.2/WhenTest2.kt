

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
	var score = 'B'
	when (score){
		'A' -> {
			println("����")
			println("���ٳ߸�ͷ������")
		}
		'B' -> {
			println("����")
			println("��ƴһ�ѣ��㲻֪���Լ�������")
		}
		'C' -> println("��")
		'D' -> println("����")
		else -> {
			println("������")
			println("ɶҲ��˵�ˣ��´�����")
		}
	}
}
