

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
// ����Apple��̳�Fruit
class Apple: Fruit(0.0)
fun main(args: Array<String>) {
	// ����Apple����
	var a = Apple()
	// Apple������û��weight����
	// ��ΪApple�ĸ�����weight���ԣ�Ҳ���Է���Apple�����weight����
	a.weight = 56.0
	// ����Apple�����info()����
	a.info()
}