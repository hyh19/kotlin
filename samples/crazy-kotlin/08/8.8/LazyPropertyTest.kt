

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
//val lazyProp: String by lazy {
//	println("第一次访问时执行代码块")
//	"疯狂软件"
//}
val lazyProp: String by lazy(LazyThreadSafetyMode.NONE) {
	println("第一次访问时执行代码块")
	"疯狂软件"
}
fun main(args: Array<String>) {
	// 两次访问lazyProp属性
	println(lazyProp)
	println(lazyProp)
}