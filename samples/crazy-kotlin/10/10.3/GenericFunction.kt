

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
fun <T> copy(from: List<T>, to: MutableList<in T>){
	for(ele in from){
		to.add(ele)
	}
}
fun main(args: Array<String>) {
	var strList = listOf("Java", "Kotlin")
	var objList: MutableList<Any> = mutableListOf(2, 1.2, "Android")
	// ָ�����ͺ�����TΪString����
	copy<String>(strList , objList)  // ��
	println(objList)
	var intList = listOf(7, 13, 17, 19)
	// ����ʽָ�����ͺ�����T�����ͣ�ϵͳ�ƶ�TΪInt����
	copy(intList , objList)
	println(objList)
}