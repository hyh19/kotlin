

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
// �������βθ����ɱ�ĺ���
fun test(a : Int , vararg books : String) {
    // books���������鴦��
    for( b in books) {
        println(b)
    }
    // �����������a��ֵ
    println(a)
}
fun main(args: Array<String>) {
	// ����test()����
	test(5 , "���iOS����" , "���Android����")
}