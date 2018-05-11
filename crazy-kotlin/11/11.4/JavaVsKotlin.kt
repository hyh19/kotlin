

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
// Kotlin的注解可通过位置来指定属性值
// 第一个值传给name属性，第二个值传给age属性
@KotlinTag("疯狂Kotlin讲义", 29)
class Book{
	// Kotlin的注解也可通过属性名来指定属性值
	@KotlinTag(name="kotlin", age=14)
	// Java的注解只能通过属性名来指定属性值
	@JavaTag(name="java", age=28)
	fun test(){
	}
}