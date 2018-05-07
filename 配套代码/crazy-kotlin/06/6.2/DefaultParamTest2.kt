

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
// ����һ����ӡ�����εĺ�����ֻΪ��һ������ָ��Ĭ��ֵ
fun printTriangle(height: Int = 5, char: Char){
	for (i in 1..height) {
		// �ȴ�ӡһ�ſո�
		for (j in 0 until height - i) {
			print(" ");
		}
		// �ٴ�ӡһ�������ַ�
		for (j in 0 until 2 * i - 1) {
			print(char);
		}
		println()
	}
}
fun main(args: Array<String>) {
	printTriangle(char = '*')
	printTriangle(6, '@')
	printTriangle(7, char = '#')

	// ��������Ǵ����
//	printTriangle('#')
}
