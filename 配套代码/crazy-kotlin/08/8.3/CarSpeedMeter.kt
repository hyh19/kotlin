

/**
 * Description:<br>
 * 利嫋: <a href="http://www.crazyit.org">決髄Java選男</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
public class CarSpeedMeter(var radius: Double): SpeedMeter(0.0){
	override fun calGirth(): Double{
		return radius * 2 * Math.PI
	}
}
fun main(args: Array<String>) {
	val csm = CarSpeedMeter(0.28)
	csm.turnRate = 15.0
	println(csm.getSpeed())
}