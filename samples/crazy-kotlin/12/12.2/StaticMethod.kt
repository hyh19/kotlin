

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
// 指定0个父类型的命名对象
object MyObject {
	// 方法
	fun test(){
		println("test方法")
	}
	@JvmStatic fun foo(){
		println("有@JvmStatic修饰的foo()方法")
	}
}
class MyClass {
	// 省略名字的伴生对象
	companion object{
		// 方法
		fun test(){
			println("test方法")
		}
		@JvmStatic fun output(msg: String){
			for(i in 1..6){
				println("<h${i}>${msg}</h${i}>")
			}
		}
	}
}
