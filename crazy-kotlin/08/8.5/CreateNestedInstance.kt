

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
class NestedOut{
	// 定义一个嵌套类，不使用访问控制符，默认是public
	open class Nested{
		init{
			println("嵌套类的构造器")
		}
	}
}
fun main(args: Array<String>) {
	val nested: NestedOut.Nested = NestedOut.Nested()
	/*
	上面代码可改为如下两行代码
	使用OuterClass.NestedClass的形式定义嵌套类变量
	val nested: NestedOut.Nested
	通过调用嵌套类构造器创建嵌套类实例
	nested = NestedOut.Nested()
	*/
}
class NestedSubClass: NestedOut.Nested()