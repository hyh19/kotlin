

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
class Person(name: String, age: Int){
	// ʹ��private�������ԣ�����Щ������������
	var name = name
		set(newName){
			// ִ�к�����У�飬Ҫ���û���������2~6λ֮��
			if (newName.length > 6 || newName.length < 2){
				println("�����õ�����������Ҫ��")
			} else {
				field = newName
			}
		}
	var age = age
		set(newAge){
			// ִ�к�����У�飬Ҫ���û����������0~100֮��
			if (newAge > 100 || newAge < 0) {
				println("�����õ����䲻�Ϸ�")
			} else {
				field = newAge
			}
		}
}
