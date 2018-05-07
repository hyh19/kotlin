

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
fun main(args: Array<String>) {
	try{
		var a = Integer.parseInt(args[0])
		var b = Integer.parseInt(args[1])
		val c = a / b
		println("您输入的两个数相除的结果是：${c}")
	} catch (ie: IndexOutOfBoundsException) {
		println("数组越界：运行程序时输入的参数个数不够")
	} catch (ne: NumberFormatException) {
		println("数字格式异常：程序只能接收整数参数")
	} catch (ae: ArithmeticException) {
		println("算术异常")
	} catch (e: Exception) {
		println("未知异常")
	}
}