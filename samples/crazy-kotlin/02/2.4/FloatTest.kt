

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
	var af1 = 5.2345556f;
	// ���潫����af1��ֵ�Ѿ������˸ı�
	println("af1��ֵΪ:${af1}")
	// ����af��Float���ͣ���25.2345ֵĬ����Double���ͣ��������������ʱ����
//	var af2: Float = 25.2345
	// f1�����ͱ��ƶ�ΪDouble
	var f1 = 5.12e2
	println("f1��ֵΪ:${f1}")
	var a = 0.0
	// 5.0����0.0���������������ֵ
	println("5.0/a��ֵΪ��${5.0 / a}")
	// ���е����������ֵ����ȣ��������潫�����true
	println(5.0 / a == 50000 / 0.0)
	// -5.0����0.0�����ָ��������ֵ
	println("-5.0/a��ֵΪ��${-5.0 / a}")
	// ���еĸ��������ֵ����ȣ��������潫�����true
	println(-5.0 / a == -50000 / 0.0)
	// 0.0����0.0�����ַ���
	var nan : Double = a / a
	println("a/a��ֵΪ��${nan}")
	// �������Լ�������ȣ��������潫�����false
	println(nan == nan)
}


