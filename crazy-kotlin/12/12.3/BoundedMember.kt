

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
	val str = "Kotlin"
	// ��ȡ����󶨵ķ���
	val f: (CharSequence, Boolean)->Boolean = str::endsWith
	// ���ð󶨵ķ���ʱ���贫�������
	println(f("lin" , true))
	// ��ȡ����󶨵�����
	val prop = str::length
	// ���ð󶨵�����ʱ���贫�������
	println(prop.get())

	var list = listOf("Kotlin", "Java", "Go", "Erlang")
	// ��ȡ����󶨵ķ���
	val fn = list::subList
	// ���ð󶨵ķ���ʱ���贫�������
	println(fn(1, 3)) // ���["Java", "Go"]
	// ��ȡ����󶨵�����
	val prp = list::indices
	// ���ð󶨵�����ʱ���贫�������
	println(prp.get()) // ���0..3
}