

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
var observableProp: String by Delegates.observable("Ĭ��ֵ") {
		// Lambda���ʽ�ĵ�һ��������������������
		// �ڶ������������޸�֮ǰֵ
		// �����������������õ���ֵ
        prop, old, new ->
        println("${prop} �� ${old} ����Ϊ ${new} ")
    }
fun main(args: Array<String>) {
	// ����observableProp���ԣ����ᴥ����������Lambda���ʽ
	println(observableProp)
	// ��������ֵ��������������Lambda���ʽ
	observableProp = "������"
	println(observableProp)
}