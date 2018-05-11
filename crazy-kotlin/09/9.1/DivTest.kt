

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
	try{
		var a = Integer.parseInt(args[0])
		var b = Integer.parseInt(args[1])
		val c = a / b
		println("�����������������Ľ���ǣ�${c}")
	} catch (ie: IndexOutOfBoundsException) {
		println("����Խ�磺���г���ʱ����Ĳ�����������")
	} catch (ne: NumberFormatException) {
		println("���ָ�ʽ�쳣������ֻ�ܽ�����������")
	} catch (ae: ArithmeticException) {
		println("�����쳣")
	} catch (e: Exception) {
		println("δ֪�쳣")
	}
}