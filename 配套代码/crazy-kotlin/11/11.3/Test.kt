

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
annotation class MyTag1(val prop1:String, val prop2: String)
annotation class MyTag2(val name:String, val age: Int)
class Test{
	@MyTag1(prop1="fkit.org", prop2="fkjava.org")
	@MyTag2(name="yeeku", age=29)
	fun info(){
	}
}
fun main(args: Array<String>) {
	val aArray = Test::info.annotations
	// 遍历所有注解
	for (an in aArray ){
		println(an)
	}

val anArr = Test::info.annotations
// 遍历每个注解对象
for (tag in anArr){
	// 如果tag注解是MyTag1类型
	if (tag is MyTag1){
		println("注解是：" + tag)
		// 输出注解的prop1和prop2两个属性的值
		println("tag.prop1：" + tag.prop1) 
		println("tag.prop2：" + tag.prop2)
	}
	// 如果tag注解是MyTag2类型
	if (tag is MyTag2){
		println("注解是：" + tag)
		// 将tag强制类型转换为MyTag2
		// 输出tag对象的name和age两个属性的值
		println("tag.name：" + tag.name)
		println("tag.age：" + tag.age)
	}
}
}