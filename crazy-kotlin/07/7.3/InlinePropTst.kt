

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
class Name(name: String, desc: String){
	var name = name;
	var desc = desc;
}
class Product{
	var productor: String? = null
	// inline�������Ե�getter������������ȡ����ʱ��������
	val proName: Name
		inline get() = Name("���Kotlin����", "��ϵͳ��Kotlin��")
	// inline�������Ե�setter������������������ʱ��������
	var author: Name
		get() = Name("���", "��")
		inline set(v){
			this.productor = v.name
		}
	// inline�������Ա���������ȡ���Ժ���������ʱ����������
	inline var pubHouse: Name
		get() = Name("���ӹ�ҵ������", "��")
		set(v){
			this.productor = v.name
		}
}