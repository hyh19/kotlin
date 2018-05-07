

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
// 定义主构造器
class User(name: String){
	var name: String
	var age: Int
	var info: String? = null
	init {
		println("User的初始化块")
		this.name = name
		this.age = 0
	}
	// 委托给主构造器
	constructor(name: String, age: Int): this(name){  // ①
		this.age = age
	}
	// 委托给(String,Int)构造器
	constructor(name: String, age: Int, info: String): this(name, age){  // ②
		this.info = info
	}
}
fun main(args: Array<String>){
	// 调用主构造器
	var us1 = User("孙悟空")
	println("${us1.name} => ${us1.age} => ${us1.info}")
	// 调用(String, Int)构造器
	var us2 = User("白骨精", 21)
	println("${us2.name} => ${us2.age} => ${us2.info}")
	// 调用(String, Int, String)构造器
	var us3 = User("蜘蛛精", 20, "吐死织网")
	println("${us3.name} => ${us3.age} => ${us3.info}")
}