

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
// 定义一个简单的主注解
annotation class Test

// 使用@Test修饰类定义
@Test class MyClass{
	// 使用@Test注解修饰属性
	@Test var name: String = ""
	// 使用@Test注解修饰方法
	@Test fun info(){
//		...
	}
//	...
}

class User @Test constructor(var name: String, var pass: String){
}