

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
	// ��������ָ��Ԫ�ص�����
	var strArr = arrayOf("Kotlin", "Java", "Go", "Swift")
	// ʹ�����ַ�ʽ��ȡ����Ԫ��
	println(strArr[1])
	println(strArr.get(1))
	// ʹ�����ַ�ʽ�޸�����Ԫ��
	strArr[1] = "Groovy"
	strArr.set(2, "Lua")
	println(java.util.Arrays.toString(strArr))
	// ��������Ԫ��ָ��������ֵ�������鳤�ȣ�����������뽫������ʱ�����쳣
//	println(strArr[4])

	// ����ָ�����ȣ�Ԫ��Ϊnull������
	var prices = arrayOfNulls<Double>(5)
	// ʹ��ѭ�����prices�����ÿ������Ԫ�ص�ֵ
	for (i in 0 until prices.size ) {
		println(prices[i])
	}

	var books = arrayOfNulls<String>(4)
	// �Զ�̬��ʼ���������Ԫ�ؽ��и�ֵ
	books[0] = "���Java����"
	books[1] = "������Java EE��ҵӦ��ʵս"
	// ʹ��ѭ�����books�����ÿ������Ԫ�ص�ֵ
	for (i in 0 until books.size ){
		println(books[i])
	}
}