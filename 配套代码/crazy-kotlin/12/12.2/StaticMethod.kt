

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
// ָ��0�������͵���������
object MyObject {
	// ����
	fun test(){
		println("test����")
	}
	@JvmStatic fun foo(){
		println("��@JvmStatic���ε�foo()����")
	}
}
class MyClass {
	// ʡ�����ֵİ�������
	companion object{
		// ����
		fun test(){
			println("test����")
		}
		@JvmStatic fun output(msg: String){
			for(i in 1..6){
				println("<h${i}>${msg}</h${i}>")
			}
		}
	}
}
