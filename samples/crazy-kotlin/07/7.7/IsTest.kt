

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
import java.util.Date
// 定义一个接口
interface Testable{}
fun main(args: Array<String>) {
	// 声明hello时使用Any类，则hello的编译时类型是Any
	// hello变量的实际类型是String
	val hello: Any = "Hello"
	println("字符串是否是String类的实例：${hello is String}") // 返回true
	// Date与Any类存在继承关系，可以进行is运算。
	println("字符串是否是Date类的实例：${hello is Date}")  //返回false
	// String没有实现TestProtocol协议，所以返回false
	println("字符串是否是Testable协议的实例：${hello is Testable}")  //返回false
	val a: String = "Hello"
	// String类与Date类没有继承关系，所以下面代码编译出现错误
	println("字符串是否是Date类的实例：${a is Date}")
}