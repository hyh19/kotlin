

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
class User<out T>{
	// �˴�������var���������setter������
	// setter�����ᵼ��T�����ڷ����β���
	val info: T
	constructor(info: T){
		this.info = info
	}
	fun test(): T{
		println("ִ��test����")
		return info
	}
}
fun main(args: Array<String>) {
	// ��ʱT��������String
	var user = User<String>("fkit")
	println(user.info)
	// ����u2���ԣ�����������User<Any>����ʱT��������Any
	// ���ڳ���������T֧��Э�䣬���User<String>�ɵ���User<Any>ʹ��
	var u2: User<Any> = user // ��
}
