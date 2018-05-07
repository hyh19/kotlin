

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
@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
// 指定该注解是可重复注解
@Repeatable
annotation class FkTag(val name: String = "疯狂软件", 
	val age: Int)

@FkTag(age=5)
@FkTag(name="疯狂Java" , age=9)
class FkTagTest
