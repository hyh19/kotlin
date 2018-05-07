

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
import kotlin.properties.*;
class PropertyDelegation{
	// �����Ե�ί����MyDelegation����
	var name: String by MyDelegation()
}
class MyDelegation{
	private var _backValue = "Ĭ��ֵ"
	operator fun getValue(thisRef: PropertyDelegation, property: KProperty<*>): String {
		println("${thisRef}��${property.name}����ִ��getter����")
		return _backValue
	}
	operator fun setValue(thisRef: PropertyDelegation, property: KProperty<*>, newValue: String) {
		println("${thisRef}��${property.name}����ִ��setter����" + 
			"���������ֵΪ��${newValue}")
		_backValue = newValue
	}
}
fun main(args: Array<String>) {
	val pd = PropertyDelegation()
	// ��ȡ���ԣ�ʵ�����ǵ������Ե�ί�ж����getter����
	println(pd.name)
	// д�����ԣ�ʵ�����ǵ������Ե�ί�ж����setter����
	pd.name = "fkit.org"
	println(pd.name)
}
