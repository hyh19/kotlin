

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
//val lazyProp: String by lazy {
//	println("��һ�η���ʱִ�д����")
//	"������"
//}
val lazyProp: String by lazy(LazyThreadSafetyMode.NONE) {
	println("��һ�η���ʱִ�д����")
	"������"
}
fun main(args: Array<String>) {
	// ���η���lazyProp����
	println(lazyProp)
	println(lazyProp)
}