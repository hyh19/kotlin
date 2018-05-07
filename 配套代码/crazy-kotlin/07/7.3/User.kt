

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
class User(first: String, last: String){
	var first:String = first
	var last :String = last
	val fullName: String
		// 自定义getter方法
		get() {
			println("执行fullName的getter方法")
			return "${first}.${last}"
		}
}