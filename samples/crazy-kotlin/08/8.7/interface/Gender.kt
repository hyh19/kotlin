

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
// ʹ��������������cnNameֻ������
enum class Gender(val cnName: String): GenderDesc {
	MALE("��"), FEMALE("Ů");
	// ��д�ӿ��ж���ĳ��󷽷�
	override fun info(){
		when(this) {
			MALE -> println("���н�����������ǿ��Ϣ")
			FEMALE -> println("�������������Ժ������")
		}
	}
}
