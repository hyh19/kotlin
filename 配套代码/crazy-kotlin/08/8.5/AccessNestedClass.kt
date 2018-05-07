

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
class AccessNestedClass{
	class NestedClass{
		var prop = 9
	}
	fun accessNestedProp(){
		// println(prop)
		// 上面代码出现错误，应改为如下形式
		// 通过对象访问嵌套类的成员
		println(NestedClass().prop)
	}
}
