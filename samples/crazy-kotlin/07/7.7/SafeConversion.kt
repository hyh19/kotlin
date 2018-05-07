

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
open class Fruit {
	var name: String
	var weight: Double
	constructor(name: String, weight: Double) {
		this.name = name
		this.weight = weight
	}
}
class Apple: Fruit {
	var color : String
	constructor(name:String, weight:Double, color:String):super(name, weight){
		this.color = color
	}
}
class Grape: Fruit {
	var sugarRate: Double
	constructor(name: String, weight: Double, sugarRate: Double):super(name, weight){
		this.sugarRate = sugarRate
	}
}
fun main(args: Array<String>) {
	// ʹ�����鱣��4��ˮ��
	var fruits = arrayOf(
		Apple("�츻ʿ", 1.8, "�ۺ�"),
		Apple("��ţ��", 2.3, "��ɫ"),
		Grape("�޷�", 1.4, 0.34),
		Grape("��������", 2.2, 0.45))
	// ����fruits��������Array<Fruit>����˳���ֻ֪��������Ԫ����Fruit
	for (f in fruits) {
		// �˴�ʹ��as?ǿ��ת�ͣ����ap��������Apple?
		var ap = f as? Apple
		// ����ap��������ap?����˳���ʹ��?.���﷨��������������
		println("${ap?.name}ƻ������ɫ�ǣ�${ap?.color}")
	}
}