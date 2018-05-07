

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
fun main(args: Array<String>) {
	var count = 0
	// while后紧跟一个分号，表明循环体是一个分号（空语句）
	while (count < 10);
	// 下面的代码块与while循环已经没有任何关系
	{
		println("count: ${count}")
		count++
	}
}