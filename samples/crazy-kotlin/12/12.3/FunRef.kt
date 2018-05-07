

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
// �����������صĺ���
fun isSmall(i: Int) = i < 5
fun isSmall(s: String) = s.length < 5
fun main(args: Array<String>) {
	val list = listOf(20 , 30, 100, 4, -3, 2, -12)
	/*
	����filter()������Ҫ(Int)->Boolean���Ͳ�����
	�ʴ˴�::isSmall���õ�һ������
	*/
	val resultList = list.filter(::isSmall)
	println(resultList) // ���[4, -3, 2, -12]
	val strlist = listOf("Java" , "Kotlin", "Swift", "Go", "Erlang")
	/*
	����filter()������Ҫ(String)->Boolean���Ͳ�����
	�ʴ˴�::isSmall���õڶ�������
	*/
	val resultStrList = strlist.filter(::isSmall)
	println(resultStrList) // ���[Java, Go]
	// �޷��ƶ�::isSmall���������ĸ�����������
//	val f = ::isSmall
	// �����ƶ�::isSmall���������ĸ���������ȷ
	var f: (String) -> Boolean = ::isSmall
	println(f("Lua"))
}