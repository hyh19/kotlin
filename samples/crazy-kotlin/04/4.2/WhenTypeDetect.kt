

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
	var inputPrice = 26
	println(realPrice(inputPrice))
}
// �����inputPrice�����ͽ����ж�
fun realPrice(inputPrice: Any) = when(inputPrice){
	// ���inputPrice������ΪString�����򷵻ظ��ַ���ת����Doubleֵ
	is String -> inputPrice.toDouble()
	// ���inputPrice������ΪInt�����򷵻ظ�Intֵת����Doubleֵ
	is Int -> inputPrice.toDouble()
	is Double -> inputPrice
	else -> 0.0
}

