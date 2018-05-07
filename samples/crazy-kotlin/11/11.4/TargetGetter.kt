

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
import java.lang.reflect.*
// 先定义2个注解
annotation class MyTag
annotation class FkTag(val info: String)
class Item{
	// 指定注解只对getter方法起作用
	// 对getter方法应用了2个注解：MyTag、FkTag
	@get:[MyTag FkTag(info="补充信息")]
	var name: String = "fkjava"
}
fun main(args: Array<String>) {
	// 获取Item类对应Java类（Class对象）
	val clazz = Item::class.java
	// 遍历clazz类所包含的全部方法
	for (mtd in clazz.getDeclaredMethods()) {
		println("--方法${mtd}上的注解为如下--")
		// 遍历该方法上直接声明的所有注解
		for(an in mtd.getDeclaredAnnotations()){
			println(an)
		}
	}
	// 遍历clazz类所包含的全部成员变量
	for (f in clazz.getDeclaredFields()) {
		println("--方法${f}上的注解为如下--")
		// 遍历该成员变量上直接声明的所有注解
		for(an in f.getDeclaredAnnotations()){
			println(an)
		}
	}
}