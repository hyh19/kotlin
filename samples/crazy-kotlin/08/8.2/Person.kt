

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
class Name(var firstName: String = "", var lastName: String = ""){
}
//class Person(val name: Name){
//}
class Person{
	val name: Name
		// ����һ���µĶ��󣬸ö����firstName��lastName
		// ���Person�������Ļ���ֶε�firstName��lastName��ͬ
		get() = Name(field.firstName, field.lastName)
	constructor(name: Name){
		// ����name����ֵΪ�´�����Name���󣬸ö����firstName��lastName
		// �봫���name������firstName��lastName��ͬ
		this.name = Name(name.firstName, name.lastName)
	}
}
fun main(args: Array<String>){
	val n = Name("���", "��")
	var p = Person(n)
	// Person�����name��firstNameֵΪ"���"
	println(p.name.firstName)
	// �ı�Person�����name��firstNameֵ
	n.firstName = "�˽�"
	// Person�����name��firstNameֵ����Ϊ"�˽�"
	println(p.name.firstName)
}