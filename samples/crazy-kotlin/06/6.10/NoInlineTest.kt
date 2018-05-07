

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
inline fun test(fn1: (Int)->Int, noinline fn2:(String)->String){
	println(fn1(20))
	println(fn2("Kotlin"))
}
fun main(args: Array<String>) {
	test({it * it}, {"疯狂${it}讲义"})
}