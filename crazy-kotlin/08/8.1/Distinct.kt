

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
class Tiger{
	fun foo(){
		println("Tiger���foo()����")
	}
}
class Bear{
	fun foo(){
		println("Bear���foo()����")
	}
	// �Գ�Ա��ʽΪTiger����չtest()����
	fun Tiger.test(){
		foo()
		// ʹ�ô���ǩ��thisָ������Bear��foo()����
		this@Bear.foo()
	}
	fun info(tiger: Tiger){
		tiger.test()
	}
}
fun main(args: Array<String>) {
	val b = Bear()
	b.info(Tiger())
}