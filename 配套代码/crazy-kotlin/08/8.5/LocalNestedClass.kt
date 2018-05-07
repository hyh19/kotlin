

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
class LocalNestedClass{
	fun info(){
		// ����ֲ�Ƕ����
		open class NestedBase(var a: Int = 0){
		}
		// ����ֲ�Ƕ���������
		class NestedSub(var b: Int = 0): NestedBase(){
		}
		// �����ֲ�Ƕ����Ķ���
		val ns = NestedSub()
		ns.a = 5
		ns.b = 8
		println("NestedSub�����a��b�����ǣ�${ns.a},${ns.b}")
	}
}
fun main(args: Array<String>) {
	LocalNestedClass().info()
}