

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
open class Foo {
	open fun test(){
		println("Foo的test") 
	}
	fun foo(){ 
		println("foo")
	}
}
interface Bar {
	// 接口中成员默认是open的
	fun test(){
		println("Bar的test")
	}
	fun bar(){
		println("bar") 
	}
}
class Wow : Foo(), Bar {
	// 编译器要求必须重写test()
	override fun test(){
		super<Foo>.test() // 调用父类Foo的test()
		super<Bar>.test() // 调用父接口Bar的test()
	}
}
fun main(args: Array<String>){
	var w = Wow()
	w.test()
}
