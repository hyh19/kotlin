

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
fun main(args: Array<String>) {
	// ö����Ĭ����һ��values()���������ظ�ö���������ʵ��
	for (s in Season.values()){
		println(s)
	}
	val seasonName = "SUMMER"
	val s: Season = Season.valueOf(seasonName)
	println(s)
	// ֱ�ӷ���ö��ֵ
	println(Season.WINTER)

	printAllValues<Season>() // ��� SPRING, SUMMER, FALL, WINTER
}
inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}
