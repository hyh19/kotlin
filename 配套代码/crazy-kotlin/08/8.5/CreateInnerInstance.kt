

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
class Out{
	// ����һ���ڲ��࣬��ʹ�÷��ʿ��Ʒ���Ĭ����public
	open inner class In(msg: String){
		init{
			println(msg)
		}
	}
}
fun main(args: Array<String>) {
	var oi: Out.In = Out().In("������Ϣ")
	/*
	�������ɸ�Ϊ�������д���
	ʹ��OutterClass.InnerClass����ʽ�����ڲ������
	var oi: Out.In
	�����ⲿ��ʵ�����ڲ���ʵ���������ڸ�ʵ����
	val ot = Out()
	ͨ���ⲿ��ʵ���������ڲ��๹���������ڲ���ʵ��
	oi = ot.In("������Ϣ")
	*/
}