

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
class Person(name: String){
	// ���涨��һ����ʼ����
	init{
		var a = 6
		if (a > 4){
			println("Person��ʼ���飺�ֲ�����a��ֵ����4")
		}
		println("Person�ĳ�ʼ����")
		println("name����Ϊ��${name}")
	}
	// ����ڶ�����ʼ����
	init{
		println("Person�ĵڶ�����ʼ����")
	}
}
fun main(args: Array<String>){
	Person("�����")
}