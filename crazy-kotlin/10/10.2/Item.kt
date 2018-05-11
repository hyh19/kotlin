

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
class Item<in T>{
	fun foo(t: T){
		println(t)
	}
}
fun main(args: Array<String>) {
	// 此时T的类型是Any
	var item = Item<Any>()
	item.foo(20)
	var im2: Item<String> = item
	// im2的实际类型是Item<Any>，因此它的foo参数只要是Any即可
	// 但我们声明了im2的类型为Item<String>，
	// 因此传入参数只可能是String，因此程序肯定是安全的
	im2.foo("Kotlin") // ①
}
