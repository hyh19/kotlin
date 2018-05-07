

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
interface Outputable{
	fun output(msg: String)
}
class MyClass{
	// ʹ��companion���εİ�������
	companion object: Outputable{
		val name = "name����ֵ"
		// ��д���ӿ��еĳ��󷽷�
		override fun output(msg: String){
			for(i in 1..6){
				println("<h${i}>${msg}</h${i}>")
			}
		}
	}
}
// Ϊ����������չ����
fun MyClass.Companion.test(){
	println("Ϊ����������չ�ķ���")
}
val MyClass.Companion.foo
	get() = "Ϊ����������չ������"
fun main(args: Array<String>) {
	// ʹ�ð����������ڵ�����ð�������ĳ�Ա
	MyClass.output("fkit.org")
	println(MyClass.name)
	// ͨ�������������ڵ������Ϊ����������չ�ĳ�Ա
	MyClass.test()
	println(MyClass.foo)
}