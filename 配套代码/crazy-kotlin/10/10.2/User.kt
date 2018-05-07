

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
class User<out T>{
	// 此处不能用var，否则就有setter方法，
	// setter方法会导致T出现在方法形参中
	val info: T
	constructor(info: T){
		this.info = info
	}
	fun test(): T{
		println("执行test方法")
		return info
	}
}
fun main(args: Array<String>) {
	// 此时T的类型是String
	var user = User<String>("fkit")
	println(user.info)
	// 对于u2而言，它的类型是User<Any>，此时T的类型是Any
	// 由于程序声明了T支持协变，因此User<String>可当成User<Any>使用
	var u2: User<Any> = user // ①
}
