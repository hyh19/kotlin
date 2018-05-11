

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
// ����һ���ܷ��࣬��ʵ���ǳ�����
sealed class Apple{
	abstract fun taste()
}
open class RedFuji: Apple(){
	override fun taste(){
		println("�츻ʿ����ɿ�")
	}
}
data class Gala(var weight: Double): Apple(){
	override fun taste(){
		println("�����������,����Ϊ��${weight}")
	}
}
fun main(args: Array<String>){
	// ʹ��Apple����������������ʵ����ֵ
	var ap1: Apple = RedFuji()
	var ap2: Apple = Gala(2.3)
	ap1.taste()
	ap2.taste()
}
fun judge(ap: Apple){
	when (ap) {
		is RedFuji -> println("�츻ʿ")
		is Gala -> println("������")
	}
}