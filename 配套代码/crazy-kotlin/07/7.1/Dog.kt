

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

class Dog
{
	// 定义一个jump()方法
	fun jump()
	{
		println("正在执行jump方法")
	}
	// 定义一个run()方法，run()方法需要借助jump()方法
	fun run()
	{
		// 使用this引用调用run()方法的对象
		this.jump()
		println("正在执行run方法")
	}
}

