

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
annotation class MyTag1(val prop1:String, val prop2: String)
annotation class MyTag2(val name:String, val age: Int)
class Test{
	@MyTag1(prop1="fkit.org", prop2="fkjava.org")
	@MyTag2(name="yeeku", age=29)
	fun info(){
	}
}
fun main(args: Array<String>) {
	val aArray = Test::info.annotations
	// ��������ע��
	for (an in aArray ){
		println(an)
	}

val anArr = Test::info.annotations
// ����ÿ��ע�����
for (tag in anArr){
	// ���tagע����MyTag1����
	if (tag is MyTag1){
		println("ע���ǣ�" + tag)
		// ���ע���prop1��prop2�������Ե�ֵ
		println("tag.prop1��" + tag.prop1) 
		println("tag.prop2��" + tag.prop2)
	}
	// ���tagע����MyTag2����
	if (tag is MyTag2){
		println("ע���ǣ�" + tag)
		// ��tagǿ������ת��ΪMyTag2
		// ���tag�����name��age�������Ե�ֵ
		println("tag.name��" + tag.name)
		println("tag.age��" + tag.age)
	}
}
}