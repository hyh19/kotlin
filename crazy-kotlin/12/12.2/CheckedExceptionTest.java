

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class CheckedExceptionTest {
	public static void main(String[] args){
		// 下面代码错误，编译器会检查IOException
		// 因此程序要么捕捉该异常，要么显式声明抛出该异常
		CheckedExceptionKt.foo();
	}
}
