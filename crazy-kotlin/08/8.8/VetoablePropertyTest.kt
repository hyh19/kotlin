

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
import kotlin.properties.*;
var vetoableProp: Int by Delegates.vetoable(20) {
		// Lambda���ʽ�ĵ�һ��������������������
		// �ڶ������������޸�֮ǰֵ
		// �����������������õ���ֵ
		prop, old, new -> 
			println("${prop} �� ${old} ����Ϊ ${new} ")
			new > old
	}
fun main(args: Array<String>) {
	// ����vetoableProp���ԣ����ᴥ����������Lambda���ʽ
	println(vetoableProp)
	// ��ֵС�ھ�ֵ��������Lambda���ʽ����false����ֵ����ʧ��
	vetoableProp = 15 
	println(vetoableProp) // ����20
	// ��ֵ���ھ�ֵ��������Lambda���ʽ����true����ֵ���óɹ�
	vetoableProp = 25 
	println(vetoableProp) // ����25
}