

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
class MyTest{
	// 使用@Testable注解指定该方法是需要测试的
	@Testable
	fun m1(){
	}
	fun m2(){
	}
	// 使用@Testable注解指定该方法是需要测试的
	@Testable
	fun m3(){
		throw IllegalArgumentException("参数出错了！")
	}
	fun m4(){
	}
	// 使用@Testable注解指定该方法是需要测试的
	@Testable
	fun m5(){
	}
	fun m6(){
	}
	// 使用@Testable注解指定该方法是需要测试的
	@Testable
	fun m7(){
		throw RuntimeException("程序业务出现异常！")
	}
	fun m8(){
	}
}
