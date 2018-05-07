

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
import kotlin.reflect.*;
class MyDelegation{
	private var _backValue = "Ĭ��ֵ"
	operator fun getValue(thisRef: Nothing?, property: KProperty<*>): String {
		println("${thisRef}��${property.name}����ִ��getter����")
		return _backValue
	}
	operator fun setValue(thisRef: Nothing?, property: KProperty<*>, newValue: String) {
		println("${thisRef}��${property.name}����ִ��setter����" + 
			"���������ֵΪ��${newValue}")
		_backValue = newValue
	}
}
fun main(args: Array<String>) {
	var name: String by MyDelegation()
	// ���ʾֲ�������ʵ�����ǵ���MyDelegation�����getValue()����
	println(name)
	// �Ծֲ�������ֵ��ʵ�����ǵ���MyDelegation�����setValue()����
	name = "�µ�ֵ"
	println(name)
}