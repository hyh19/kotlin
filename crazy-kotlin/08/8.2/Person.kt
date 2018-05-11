

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
class Name(var firstName: String = "", var lastName: String = ""){
}
//class Person(val name: Name){
//}
class Person{
	val name: Name
		// 返回一个新的对象，该对象的firstName和lastName
		// 与该Person对象里的幕后字段的firstName和lastName相同
		get() = Name(field.firstName, field.lastName)
	constructor(name: Name){
		// 设置name属性值为新创建的Name对象，该对象的firstName和lastName
		// 与传入的name参数的firstName和lastName相同
		this.name = Name(name.firstName, name.lastName)
	}
}
fun main(args: Array<String>){
	val n = Name("悟空", "孙")
	var p = Person(n)
	// Person对象的name的firstName值为"悟空"
	println(p.name.firstName)
	// 改变Person对象的name的firstName值
	n.firstName = "八戒"
	// Person对象的name的firstName值被改为"八戒"
	println(p.name.firstName)
}