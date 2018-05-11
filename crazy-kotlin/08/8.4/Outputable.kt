

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
	// ֻ�����Զ�����getter�������ǳ�������
	val name: String
		get() = "����豸"
	// ֻ������û�ж���getter��������������
	val brand: String
	// ��д����û�ж���getter��setter��������������
	var category: String
	// �ӿ��ﶨ��ĳ��󷽷�
	fun out()
	fun getData(msg: String)
	// �ڽӿ��ж���ķǳ��󷽷�����ʹ��private����
	fun print(vararg msgs: String){
		for (msg in msgs){
			println(msg)
		}
	}
	// �ڽӿ��ж���ķǳ��󷽷�����ʹ��private����
	fun test(){
		println("�ӿ���test()����")
	}
}
