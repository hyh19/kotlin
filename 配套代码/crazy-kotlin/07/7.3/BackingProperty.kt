

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
class BackingProperty(name: String){
	// ����private���ε����ԣ���������Ļ��ʹ��
	private var _name: String = name
	var name 
		// ��дgetter����������Ļ�����Ե�ֵ
		get() = _name
		set(newName){
			// ִ�к�����У�飬Ҫ���û���������2~6λ֮��
			if (newName.length > 6 || newName.length < 2){
				println("�����õ�����������Ҫ��")
			} else {
				// ��Ļ�����Ը�ֵ
				_name = newName
			}
		}
}
fun main(args: Array<String>) {
	var p = BackingProperty("���")
	// ����p.name��ʵ���ϻ�תΪ����Ļ������_name
	println(p.name)
	// ��p.name��ֵ��ʵ���ϻ�תΪ��Ļ������_name��ֵ
	p.name = "�����"
	println(p.name)
}