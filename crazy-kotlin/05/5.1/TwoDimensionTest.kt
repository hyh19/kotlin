

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
	// ��a����һά������г�ʼ������ʼ��a��һ������Ϊ4������
	// a���������Ԫ������Array<Int>����
	var a = arrayOfNulls<Array<Int>>(4)
	// ��a���鵱��һά���飬����a�����ÿ������Ԫ��
	for (i in a.indices){
		println(a[i])
	}
	// ��ʼ��a����ĵ�һ��Ԫ��
	a[0] = arrayOf(2, 5)
	// ����a����ĵ�һ��Ԫ����ָ����ĵڶ���Ԫ��
	a[0]?.set(1 , 6)
	// a����ĵ�һ��Ԫ����һ��һά���飬�������һά����
	for (i in a[0]!!.indices ){
		println(a[0]?.get(i))
	}

	// ͬʱ��ʼ����ά���������ά��
	var b = Array<IntArray>(3, {IntArray(4, {0})})

	// ʹ��arrayOf����ʼ��һ����ά����
	var str1 =arrayOf(arrayOfNulls<String>(3) 
		, arrayOf("hello"))

}