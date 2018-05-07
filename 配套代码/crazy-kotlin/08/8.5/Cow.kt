

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
// ͨ����������Ϊ�ⲿ�ඨ������
class Cow(var weight: Double = 0.0){
	// ����һ���ڲ��ࣨ��inner���Σ��൱��Java�ķǾ�̬�ڲ��ࣩ
	// ͨ����������Ϊ�ڲ��ඨ������
	private inner class CowLeg(var length:Double = 0.0, var color: String = ""){
		// �ڲ���ķ���
		fun info(){
			println("��ǰţ����ɫ�ǣ�${color}, �ߣ�${length}")
			// ֱ�ӷ����ⲿ���private���ε�foo()����
			foo() // ��
		}
	}
	fun test(){
		val cl = CowLeg(1.12 , "�ڰ����")
		cl.info()
	}
	private fun foo(){
		println("Cow��foo����")
	}
}
fun main(args: Array<String>){
	val cow = Cow(378.9);
	cow.test()
}