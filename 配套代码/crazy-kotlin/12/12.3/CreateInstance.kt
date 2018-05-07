

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
import kotlin.reflect.full.*
class Item(var name: String){
	var price = 0.0
	constructor():this("δ֪��Ʒ"){
		this.price = 0.0
	}
	constructor(name: String, price: Double):this(name){
		this.price = price
	}
}
fun main(args: Array<String>) {
	val clazz = Item::class
	// createInstance()���������޲����Ĺ���������ʵ��
	val inst1 = clazz.createInstance()
	println(inst1.name)
	println(inst1.price)
	// ��ȡ���й�����
	val cons = clazz.constructors
	cons.forEach {
		if(it.parameters.size == 2) {
			// ���ô�2�������Ĺ���������ʵ��
			val inst2 = it.call("���Kotlin����", 78.8)
			println(inst2.name)
			println(inst2.price)
		}
	}
}