

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
	var width: Float = 2.3f
	var height: Double = 4.5
	// width������ʽǿ��ת��ΪDouble֮�󣬲��ܸ�ֵ������a
	var a: Double = width.toDouble()
	println("a��ֵΪ: ${a}")
	// ��heightǿ��ת��ΪFloat֮���ٽ��м��㣬�������ʽ�����Ͷ���Float����
	// ���area1������Ҳ���ƶ�ΪFloat����
	var area1 = width * height.toFloat()
	// ���ʽ��height��Double���ͣ����ǵȼ���ߵ�������
	// ����������ʽ�����Ͷ���Double���ͣ�area2������Ҳ���ƶ�ΪDouble����
	var area2 = width * height
	val multi: Int = 5
	// ���totalHeight1������Ҳ���ƶ�ΪDouble����
	var totalHeight1 = height * multi  // ��
	// ��heightǿ��ת��ΪInt����м��㣬�������ʽ�����Ͷ���Int����
	// ���totalHeight2������Ҳ���ƶ�ΪInt����
	var totalHeight2 = height.toInt() * multi  // ��
}