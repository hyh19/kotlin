

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
// ������������
class User(name: String){
	var name: String
	var age: Int
	var info: String? = null
	init {
		println("User�ĳ�ʼ����")
		this.name = name
		this.age = 0
	}
	// ί�и���������
	constructor(name: String, age: Int): this(name){  // ��
		this.age = age
	}
	// ί�и�(String,Int)������
	constructor(name: String, age: Int, info: String): this(name, age){  // ��
		this.info = info
	}
}
fun main(args: Array<String>){
	// ������������
	var us1 = User("�����")
	println("${us1.name} => ${us1.age} => ${us1.info}")
	// ����(String, Int)������
	var us2 = User("�׹Ǿ�", 21)
	println("${us2.name} => ${us2.age} => ${us2.info}")
	// ����(String, Int, String)������
	var us3 = User("֩�뾫", 20, "����֯��")
	println("${us3.name} => ${us3.age} => ${us3.info}")
}