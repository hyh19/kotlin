

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
	val str = when (score){
		'A' -> {
			println("望百尺竿头更进步")
			"优秀"
		}
		'B' -> {
			println("不拼一把，你不知道自己的能力")
			"良好"
		}
		'C' -> "中"
		'D' -> "及格"
		else -> {
			println("啥也不说了，下次再来")
			"不及格"
		}
	}
	println(str)
}
