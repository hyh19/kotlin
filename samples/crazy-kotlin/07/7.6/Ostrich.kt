

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
class Ostrich: Bird(){
	// ��дBird���fly()����
	override fun fly(){
		println("��ֻ���ڵ��ϱ���...")
	}
	fun callOverridedMethod(){
		// �����෽����ͨ��super��ʽ���ø��౻���ǵķ���
		super.fly()
	}
}
fun main(args: Array<String>) {
	// ����Ostrich����
	var os = Ostrich()
	// ִ��Ostrich�����fly()�����������"��ֻ���ڵ��ϱ���..."
	os.fly()

	os.callOverridedMethod()
}