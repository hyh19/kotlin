

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
	var bookPrice : Byte = 79
	var itemPrice : Short = 120
	// bookPrice��Byte���ͣ�������a��Short���ͣ��������������
//	var a: Short = bookPrice
	// ��ʽ��bookPriceǿ��ת��ΪShort����
	var a: Short = bookPrice.toShort()  // ��
	var b: Byte = itemPrice.toByte()
	println("a: ${a}, b: ${b}")
	val amount = 233
	// ��Int�ͱ���ת��ΪByte���ͣ��������
	val byteAmount: Byte = amount.toByte() // ��
	println(byteAmount)

	// �������ʽ��bookPrice��itemPrice���Զ�����ΪInt����
	var total = bookPrice + itemPrice  // ��
	println("total��ֵΪ:${total}")
	// �ɿ���totalӳ���Java����Ϊint
	println("total������Ϊ:${total.javaClass}")
	// ������ʽ��bookPriceǿ��ת��ΪLogn���ͣ�����������ʽ����ΪLong
	val tot = bookPrice.toLong() + itemPrice.toByte()  // ��
	println("total��ֵΪ:${tot}")
	// �ɿ���totalӳ���Java����Ϊlong
	println("total������Ϊ:${tot.javaClass}")
}