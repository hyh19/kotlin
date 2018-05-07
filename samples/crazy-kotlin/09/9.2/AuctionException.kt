

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
class AuctionException: Exception{
	// 无参数的构造器
	constructor() {}       // ①
	// 带一个字符串参数的构造器
	constructor(msg: String): super(msg) {}  // ②
}