

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
class ExtensionAndMember {
	// Ϊ���ඨ���Ա������foo()
	fun foo() = println("��Ա����")
}
// ΪExtensionAndMember�ඨ����չ������foo()
fun ExtensionAndMember.foo() = println("��չ����")
fun main(args: Array<String>){
	var ea = ExtensionAndMember()
	// ea����foo()����������ʹ�ó�Ա����
	ea.foo() // ���"��Ա����"
}

fun ExtensionAndMember.foo(name: String) = println("��չ����,����:${name}")
fun ExtensionAndMember.foo(age: Int) = println("��չ����,����:${age}")
 