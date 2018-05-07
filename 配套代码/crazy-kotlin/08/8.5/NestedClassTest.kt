

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
class NestedClassTest{
	var prop1 = 5
	fun test(){
		println("外部类的test()方法")
	}
	// 没有inner修饰符，是嵌套类（相当于Java的静态内部类）
	class NestedClass{
		fun accessOuterMember(){
			// 访问另一个嵌套类是允许的。
			val a = A()
			// 下面两行代码都会出现错误
			println(prop1)
			test()
		}
	}
	class A
}
