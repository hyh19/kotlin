

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
class ConstructorOverload{
	var name: String?
	var count: Int
	init{
		println("��ʼ���飡")
	}
	// �ṩ�޲����Ĺ�����
	constructor(){
		name = null
		count = 0
	}
	constructor(name:String, count:Int){
		this.name = name
		this.count = count
	}
}
fun main(args: Array<String>) {
	// ͨ���޲�������������ConstructorOverload����
	var oc1 = ConstructorOverload()
	// ͨ���в�������������ConstructorOverload����
	var oc2 = ConstructorOverload(
		"������Java EE��ҵӦ��ʵս", 300000);
	println("${oc1.name} ${oc1.count}")
	println("${oc2.name} ${oc2.count}")
}