

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
open class Foo {
	open fun test(){
		println("Foo��test") 
	}
	fun foo(){ 
		println("foo")
	}
}
interface Bar {
	// �ӿ��г�ԱĬ����open��
	fun test(){
		println("Bar��test")
	}
	fun bar(){
		println("bar") 
	}
}
class Wow : Foo(), Bar {
	// ������Ҫ�������дtest()
	override fun test(){
		super<Foo>.test() // ���ø���Foo��test()
		super<Bar>.test() // ���ø��ӿ�Bar��test()
	}
}
fun main(args: Array<String>){
	var w = Wow()
	w.test()
}
