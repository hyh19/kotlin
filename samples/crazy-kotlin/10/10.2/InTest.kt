

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
fun fill(dest: Array<in String>, value: String) {
	if (dest.size > 0) {
		dest[0] = value
	}
}
fun main(args: Array<String>) {
	var arr1: Array<CharSequence> = arrayOf("a", "b", StringBuilder("cc"))
	fill(arr1, "xxxx") // ①
	println(arr1.contentToString())

	var intArr: Array<in Int> = arrayOf(2, 5, 39) 
	println(intArr.contentToString())
	intArr.set(0, 34)  // ②
	var numArr: Array<Number> = arrayOf(3, 4.1, 10.4)
	intArr = numArr; // ③、Array不支持声明处型变，编译错误
	println(intArr.contentToString())
}