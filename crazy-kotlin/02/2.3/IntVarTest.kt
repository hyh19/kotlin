

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
	// �����������ȷ��
	var a:Int = 56
	// ���������Ҫ��ʽ�ؽ�2999999999ת��ΪInt��ʹ�ã���˱��������ᱨ��
//	var bigValue : Int = 2999999999
	// �����������ȷ��
	var bigValue2: Long = 2999999999
//	println(bigValue)
	println(bigValue2)
	println(Short.MIN_VALUE)
	println(Short.MAX_VALUE)

	// Int�ͱ�����֧��nullֵ��������������Ǵ����
//	var notNull: Int = null
	// Int?�൱��֧��nullֵ��Int�ͣ����������������ȷ��
	var nullable: Int? = null

	var pm1: Int = 200; // pm1��������Java��int����
	var pm2: Int = 200; // pm2��������Java��int����
	println(pm1 === pm2); // �������ͱȽϣ����true
	var ob1: Int? = 100; // ob1��������Java��Integer����
	var ob2: Int? = 100; // ob2��������Java��Integer����
	println(ob1 === ob2); // �������ͱȽϣ����false
}