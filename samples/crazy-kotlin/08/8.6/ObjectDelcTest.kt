

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
interface Outputable{
	fun output(msg: String)
}
abstract class Product(var price: Double){
	abstract val name: String
	abstract fun printInfo()
}
// 指定一个父类型（接口）的对象表达式
object MyObject1: Outputable{
	// 重写父接口中的抽象方法
	override fun output(msg: String){
		for(i in 1..6){
			println("<h${i}>${msg}</h${i}>")
		}
	}
}
// 指定0个父类型的对象表达式
object MyObject2 {
	// 初始化块
	init{
		println("初始化块")
	}
	// 属性
	var name = "Kotlin"
	// 方法
	fun test(){
		println("test方法")
	}
	// 只能包含嵌套类，不能包含内部类
	class Foo
}
// 指定2个父类型的对象表达式
// 由于Product只有一个带参数的构造器，因此需要传入构造器参数
object MyObject3: Outputable, Product(28.8){
	override fun output(msg: String){
		println("输出信息：" + msg)
	}
	override val name: String
		get() = "激光打印机"
	override fun printInfo(){
		println("高速激光打印机，支持自动双面打印！")
	}
}
fun main(args: Array<String>) {
	MyObject1.output("疯狂软件教育中心")
	println("-------------------------")
	println(MyObject2.name)
	MyObject2.test()
	println("-------------------------")
	println(MyObject3.name)
	MyObject3.output("Kotlin真不错！")
	MyObject3.printInfo()
}