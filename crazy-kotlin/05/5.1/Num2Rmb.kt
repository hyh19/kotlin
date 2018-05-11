

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
	// ���԰�һ���������ֽ���������ֺ�С������
	println(divide(236711125.123).contentToString())
	// ���԰�һ����λ�������ַ�����ɺ����ַ���
	println(toHanStr("6109"))
}
/**
 * ��һ���������ֽ���������ֺ�С�������ַ���
 * @param num ��Ҫ���ֽ�ĸ�����
 * @return �ֽ�������������ֺ�С�����֡�
 * ��һ������Ԫ�����������֣��ڶ�������Ԫ����С������
 */
fun divide(num: Double): Array<String>{
	// ��һ��������ǿ������ת��Ϊlong�ͣ����õ�������������
	var zheng = num.toLong()
	// ��������ȥ�������֣��õ�С�����֣�С�����ֳ���100����ȡ���õ�2λС��
	var xiao = Math.round((num - zheng) * 100)
	// ���������ת��Ϊ�ַ���
	return arrayOf(zheng.toString(), xiao.toString())
}
val hanArr = arrayOf("��" , "Ҽ" , "��" , "��" , "��" , 
	"��" , "½" , "��" , "��" , "��")
val unitArr = arrayOf("ʮ" , "��" , "ǧ")
/**
 * ��һ����λ�������ַ�����ɺ����ַ���
 * @param numStr ��Ҫ��ת������λ�������ַ���
 * @return ��λ�������ַ�����ת���ɺ����ַ���
 */
fun toHanStr(numStr: String): String {
	var result = ""
	val numLen = numStr.length
	// ���α��������ַ�����ÿһλ����
	for (i in 0 until numLen ) {
		// ��Char������ת����Int�����֣���Ϊ���ǵ�ASCII��ֵǡ�����48
		// ��˰�Char�����ּ�ȥ48�õ�Int�����֣�����'4'��ת����4
		var num = numStr[i].toInt() - 48
		// ����������һλ���֣��������ֲ����㣬����Ҫ��ӵ�λ��ǧ���١�ʮ��
		if ( i != numLen - 1 && num != 0)
		{
			result += hanArr[num] + unitArr[numLen - 2 - i]
		}
		// ����Ҫ��ӵ�λ
		else
		{
			result += hanArr[num]
		}
	}
	return result
}
