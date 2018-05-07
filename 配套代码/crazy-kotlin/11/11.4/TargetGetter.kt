

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
import java.lang.reflect.*
// �ȶ���2��ע��
annotation class MyTag
annotation class FkTag(val info: String)
class Item{
	// ָ��ע��ֻ��getter����������
	// ��getter����Ӧ����2��ע�⣺MyTag��FkTag
	@get:[MyTag FkTag(info="������Ϣ")]
	var name: String = "fkjava"
}
fun main(args: Array<String>) {
	// ��ȡItem���ӦJava�ࣨClass����
	val clazz = Item::class.java
	// ����clazz����������ȫ������
	for (mtd in clazz.getDeclaredMethods()) {
		println("--����${mtd}�ϵ�ע��Ϊ����--")
		// �����÷�����ֱ������������ע��
		for(an in mtd.getDeclaredAnnotations()){
			println(an)
		}
	}
	// ����clazz����������ȫ����Ա����
	for (f in clazz.getDeclaredFields()) {
		println("--����${f}�ϵ�ע��Ϊ����--")
		// �����ó�Ա������ֱ������������ע��
		for(an in f.getDeclaredAnnotations()){
			println(an)
		}
	}
}