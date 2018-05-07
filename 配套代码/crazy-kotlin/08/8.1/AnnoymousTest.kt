

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
class HTML {
	fun body() {
		println("  <body></body>")
	}
	fun head() {
		println("  <head></head>")
	}
}
// ����һ������ΪHTML.() -> Unit���βΣ��������ߵ�����������
// �����ں�����HTML���������һ��init����
fun html(init: HTML.() -> Unit) {
	println("<html>")
	val html = HTML() // ���������߶���
	html.init()	// ʹ�ý����ߵ���init��������������������Ĳ�����
	println("</html>")
}
fun main(args: Array<String>) {
	// ����html��������Ҫ����HTML.() -> Unit���͵Ĳ���
	// ��ʱϵͳ���ƶϳ������ߵ����ͣ��ʿ���Lambda���ʽ������������
	html { // Lambda���ʽ�е�this���Ǹ÷����ĵ�����
		head()
		body()
	}
//html({
//	head()
//	body()
//})
}