

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
// ָ��һ�������ͣ��ӿڣ��Ķ�����ʽ
object MyObject1: Outputable{
	// ��д���ӿ��еĳ��󷽷�
	override fun output(msg: String){
		for(i in 1..6){
			println("<h${i}>${msg}</h${i}>")
		}
	}
}
// ָ��0�������͵Ķ�����ʽ
object MyObject2 {
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
	// ֻ�ܰ���Ƕ���࣬���ܰ����ڲ���
	class Foo
}
// ָ��2�������͵Ķ�����ʽ
// ����Productֻ��һ���������Ĺ������������Ҫ���빹��������
object MyObject3: Outputable, Product(28.8){
	override fun output(msg: String){
		println("�����Ϣ��" + msg)
	}
	override val name: String
		get() = "�����ӡ��"
	override fun printInfo(){
		println("���ټ����ӡ����֧���Զ�˫���ӡ��")
	}
}
fun main(args: Array<String>) {
	MyObject1.output("��������������")
	println("-------------------------")
	println(MyObject2.name)
	MyObject2.test()
	println("-------------------------")
	println(MyObject3.name)
	MyObject3.output("Kotlin�治��")
	MyObject3.printInfo()
}