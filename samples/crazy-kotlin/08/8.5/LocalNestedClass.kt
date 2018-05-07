

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
class LocalNestedClass{
	fun info(){
		// 定义局部嵌套类
		open class NestedBase(var a: Int = 0){
		}
		// 定义局部嵌套类的子类
		class NestedSub(var b: Int = 0): NestedBase(){
		}
		// 创建局部嵌套类的对象
		val ns = NestedSub()
		ns.a = 5
		ns.b = 8
		println("NestedSub对象的a和b属性是：${ns.a},${ns.b}")
	}
}
fun main(args: Array<String>) {
	LocalNestedClass().info()
}