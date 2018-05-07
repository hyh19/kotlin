

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
class User2(first: String, last: String){
	var first:String = first
	var last :String = last
	// 由于可通过getter方法推断该属性的类型，因此可省略类型声明
	var fullName
		// 使用单表达式定义getter方法的方法体
		get() = "${first}.${last}"
		set(value) {
			println("执行fullName的setter方法")
			// 如果value字符串中不包含.或包含几个.都不行
			if ("." !in value || value.indexOf(".") != value.lastIndexOf(".")) {
				println("您输入的fullName不合法")
			} else {
				var tokens = value.split(".")
				first = tokens[0]
				last = tokens[1]
			}
		}
}