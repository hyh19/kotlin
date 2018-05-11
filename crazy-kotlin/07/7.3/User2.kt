

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
class User2(first: String, last: String){
	var first:String = first
	var last :String = last
	// ���ڿ�ͨ��getter�����ƶϸ����Ե����ͣ���˿�ʡ����������
	var fullName
		// ʹ�õ����ʽ����getter�����ķ�����
		get() = "${first}.${last}"
		set(value) {
			println("ִ��fullName��setter����")
			// ���value�ַ����в�����.���������.������
			if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
				println("�������fullName���Ϸ�")
			} else {
				var tokens = value.split(".")
				first = tokens[0]
				last = tokens[1]
			}
		}
}