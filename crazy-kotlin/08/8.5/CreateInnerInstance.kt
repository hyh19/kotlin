

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
class Out{
	// 定义一个内部类，不使用访问控制符，默认是public
	open inner class In(msg: String){
		init{
			println(msg)
		}
	}
}
fun main(args: Array<String>) {
	var oi: Out.In = Out().In("测试信息")
	/*
	上面代码可改为如下三行代码
	使用OutterClass.InnerClass的形式定义内部类变量
	var oi: Out.In
	创建外部类实例，内部类实例将寄生在该实例中
	val ot = Out()
	通过外部类实例来调用内部类构造器创建内部类实例
	oi = ot.In("测试信息")
	*/
}