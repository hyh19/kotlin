

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
	var str = "EFGH"
	when (score){
		str[0] - 4, str[1] - 4  -> {
			println("����")
			println("���ٳ߸�ͷ������")
		}
		str[2] - 4, str[3] - 4 -> println("��")
		else -> {
			println("������")
			println("ɶҲ��˵�ˣ��´�����")
		}
	}
}
