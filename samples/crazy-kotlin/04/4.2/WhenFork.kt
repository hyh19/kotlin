

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
	// ��ȡһ������
	val ln = readLine()
	// ln��String?���ͣ�������Ҫ���ж�ln��Ϊnull
	if(ln != null){
		// when��֧����Ҫ�κ��������ʽ
		when {
			// ÿ����֧�������ǲ������ʽ
			ln.matches(Regex("\\d+")) -> println("�������ȫ������")
			ln.matches(Regex("[a-zA-Z]+")) -> println("�������ȫ����ĸ")
			ln.matches(Regex("[a-zA-Z0-9]+")) -> println("�����������ĸ������")
			else -> println("������İ��������ַ�")
		}
	}
}
