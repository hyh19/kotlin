

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
// ����һ������
fun girth(width: Double , height: Double): Double{
	println("width: ${width}")
	println("height: ${height}")
	return 2 * (width + height)
}
fun main(args: Array<String>) {
	// ��ͳ���ú����ķ�ʽ������λ�ô������
	println(girth(3.5, 4.8))
	// ���ݲ��������������
	println(girth(width = 3.5, height = 4.8))
	// �������ִ������ʱ�ɽ���λ��
	println(girth(height = 4.8, width = 3.5))
	// ����ʹ����������������ʹ��λ�ò���
	println(girth(3.5, height = 4.8))
	// λ�ò������������������֮ǰ������������
//	println(girth(width = 3.5, 4.8))
}