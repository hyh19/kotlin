

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
abstract class Product(var price: Double){
	abstract val name: String
	abstract fun printInfo()
}
fun main(args: Array<String>) {
	// ָ��һ�������ͣ��ӿڣ��Ķ�����ʽ
	var ob1 = object: Outputable{
		// ��д���ӿ��еĳ��󷽷�
		override fun output(msg: String){
			for(i in 1..6){
				println("<h${i}>${msg}</h${i}>")
			}
		}
	}
	ob1.output("��������������")
	println("-------------------------")
	// ָ��0�������͵Ķ�����ʽ
	var ob2 = object {
		// ��ʼ����
		init{
			println("��ʼ����")
		}
		// ����
		var name = "Kotlin"
		// ����
		fun test(){
			println("test����")
		}
		// ֻ�ܰ����ڲ��࣬���ܰ���Ƕ����
		inner class Foo
	}
	println(ob2.name)
	ob2.test()
	println("-------------------------")
	// ָ��2�������͵Ķ�����ʽ
	// ����Productֻ��һ���������Ĺ������������Ҫ���빹��������
	var ob3 = object: Outputable, Product(28.8){
		override fun output(msg: String){
			println("�����Ϣ��" + msg)
		}
		override val name: String
			get() = "�����ӡ��"
		override fun printInfo(){
			println("���ټ����ӡ����֧���Զ�˫���ӡ��")
		}
	}
	println(ob3.name)
	ob3.output("Kotlin�治��")
	ob3.printInfo()
}