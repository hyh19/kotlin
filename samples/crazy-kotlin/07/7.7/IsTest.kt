

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
import java.util.Date
// ����һ���ӿ�
interface Testable{}
fun main(args: Array<String>) {
	// ����helloʱʹ��Any�࣬��hello�ı���ʱ������Any
	// hello������ʵ��������String
	val hello: Any = "Hello"
	println("�ַ����Ƿ���String���ʵ����${hello is String}") // ����true
	// Date��Any����ڼ̳й�ϵ�����Խ���is���㡣
	println("�ַ����Ƿ���Date���ʵ����${hello is Date}")  //����false
	// Stringû��ʵ��TestProtocolЭ�飬���Է���false
	println("�ַ����Ƿ���TestableЭ���ʵ����${hello is Testable}")  //����false
	val a: String = "Hello"
	// String����Date��û�м̳й�ϵ������������������ִ���
	println("�ַ����Ƿ���Date���ʵ����${a is Date}")
}