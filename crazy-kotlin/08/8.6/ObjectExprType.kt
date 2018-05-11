

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
class ObjectExprType{
	private val ob1 = object {
		val name: String = "fkit"
	}
	internal val ob2 = object {
		val name: String = "fkit"
	}
	private fun privateBar() = object {
		val name: String = "fkjava.org"
	}
	fun publicBar() = object {
		val name: String = "fkjava.org"
	}
	fun test(){
		// ob1是private对象表达式，编译器可识别它的真实类型
		// 下面代码正确
		println(ob1.name)
		// ob2是非private对象表达式，编译器当它是Any类型
		// 下面代码错误
//		println(ob2.name)
		// privateBar是private函数，编译器可识别它返回的对象表达式的真实类型
		// 下面代码正确
		println(privateBar().name)
		// publicBar是非private函数，编译器将它返回的对象表达式当成Any类型
		// 下面代码错误
//		println(publicBar().name)
	}
}
fun main(args: Array<String>) {
	ObjectExprType().test()
}