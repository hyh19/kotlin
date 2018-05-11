

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
// 使用主构造器声明属性
class Customer(val name: String = "匿名", 
	var addr: String = "天河"){
}
fun main(args: Array<String>) {
	// 调用有参数的主构造器
	var ct = Customer("孙悟空", "花果山")
	println(ct.name) // 输出"孙悟空"
	println(ct.addr) // 输出"花果山"
	// 以构造参数的默认值调用构造器，看上去像调用无参的构造器
	var ctm = Customer()
	println(ctm.name) // 输出"匿名"
	println(ctm.addr) // 输出"天河"
}