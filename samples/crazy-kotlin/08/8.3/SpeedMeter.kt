

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
// �����ת�����Ե���������
abstract class SpeedMeter(var turnRate: Double){
	// �ѷ��س��ְ뾶�ķ�������ɳ��󷽷�
	abstract fun calGirth(): Double
	// ��������ٶȵ�ͨ���㷨
	fun getSpeed(): Double{
		// �ٶȵ��� �����ܳ� * ת��
		return calGirth() * turnRate
	}
}
