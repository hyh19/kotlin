

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
fun main(args: Array<String>){
	var score = 'B'
	var str = "EFGH"
	when (score){
		str[0] - 4, str[1] - 4  -> {
			println("优秀")
			println("望百尺竿头更进步")
		}
		str[2] - 4, str[3] - 4 -> println("中")
		else -> {
			println("不及格")
			println("啥也不说了，下次再来")
		}
	}
}
