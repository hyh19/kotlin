

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
	// ʡ�����ֵİ�������
	companion object: Outputable{
		// ��д���ӿ��еĳ��󷽷�
		override fun output(msg: String){
			for(i in 1..6){
				println("<h${i}>${msg}</h${i}>")
			}
		}
	}
}
fun main(args: Array<String>) {
	// ʹ�ð����������ڵ�����ð�������ķ���
	MyClass.output("fkit.org")
	// ʹ��Companion���Ʒ��ʰ�������
	println(MyClass.Companion)
}