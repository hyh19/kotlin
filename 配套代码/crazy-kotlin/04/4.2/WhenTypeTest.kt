

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
import java.util.Date
fun main(args: Array<String>){
	var date = Date()
	// when��֧���������ʽ��Date����
	when (date){
		Date() -> {
			println("����")
			println("���ٳ߸�ͷ������")
		}
		else -> {
			println("������")
			println("ɶҲ��˵�ˣ��´�����")
		}
	}
}
