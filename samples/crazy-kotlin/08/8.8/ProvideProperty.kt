

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
class MyTarget{
	// �����Ե�ί����MyDelegation����
	var name: String by PropertyChecker()
}
class PropertyChecker() {
	operator fun provideDelegate(thisRef: MyTarget,
		prop: KProperty<*>): ReadWriteProperty<MyTarget, String> {
		// �����Զ�����룬��ִ������ҵ�����
		checkProperty(thisRef, prop.name)
		// ����ʵ�ʵ�ί�ж���
		return MyDelegation()
	}
	private fun checkProperty(thisRef: MyTarget, name: String) {
		println(" ----- �������  ----");
	}
}
class MyDelegation: ReadWriteProperty<MyTarget, String>{
	private var _backValue = "Ĭ��ֵ"
	override operator fun getValue(thisRef: MyTarget, property: KProperty<*>): String {
		println("${thisRef}��${property.name}����ִ��getter����")
		return _backValue
	}
	override operator fun setValue(thisRef: MyTarget, property: KProperty<*>, value: String) {
		println("${thisRef}��${property.name}����ִ��setter����" + 
			"���������ֵΪ��${value}")
		_backValue = value
	}
}

fun main(args: Array<String>) {
	// �������󣨳�ʼ�����ԣ�������ί�й�����provideDelegate()����
	val pd = MyTarget()
	// ��ȡ���ԣ�ʵ�����ǵ������Ե�ί�ж����getter()����
	println(pd.name)
	// д�����ԣ�ʵ�����ǵ������Ե�ί�ж����setter()����
	pd.name = "fkit.org"
	println(pd.name)
}
