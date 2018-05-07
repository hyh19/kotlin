

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
open class PrivateFinalMemberTest{
	// 其实下面方法、属性使用private修饰符是多余
	private final fun test(){}
	private final var name: String = "父类属性"
}
class Sub: PrivateFinalMemberTest(){
	// 下面的方法定义不会出现问题
	public fun test(){}
	public var name: String = "子类属性"
}
