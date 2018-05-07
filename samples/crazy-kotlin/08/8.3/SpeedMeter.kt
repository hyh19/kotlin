

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
// 定义带转速属性的主构造器
abstract class SpeedMeter(var turnRate: Double){
	// 把返回车轮半径的方法定义成抽象方法
	abstract fun calGirth(): Double
	// 定义计算速度的通用算法
	fun getSpeed(): Double{
		// 速度等于 车轮周长 * 转速
		return calGirth() * turnRate
	}
}
