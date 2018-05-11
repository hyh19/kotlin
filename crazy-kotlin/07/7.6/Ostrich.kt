

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
class Ostrich: Bird(){
	// 重写Bird类的fly()方法
	override fun fly(){
		println("我只能在地上奔跑...")
	}
	fun callOverridedMethod(){
		// 在子类方法中通过super显式调用父类被覆盖的方法
		super.fly()
	}
}
fun main(args: Array<String>) {
	// 创建Ostrich对象
	var os = Ostrich()
	// 执行Ostrich对象的fly()方法，将输出"我只能在地上奔跑..."
	os.fly()

	os.callOverridedMethod()
}