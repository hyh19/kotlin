

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
class SalException: Exception {
	constructor(){}
	constructor(msg: String): super(msg) {}
	// 创建一个可以接收Throwable参数的构造器
	constructor(t: Throwable): super(t) {}
}
