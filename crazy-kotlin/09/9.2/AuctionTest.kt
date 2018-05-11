

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
public class AuctionTest{
	var initPrice: Double = 30.0
	fun bid(bidPrice: String){
		var d: Double
		try {
			d = bidPrice.toDouble()
		} catch (e: Exception) {
			// 此处完成本方法中可以对异常执行的修复处理
			// 此处仅仅是在控制台打印异常的跟踪栈信息
			e.printStackTrace()
			// 再次抛出自定义异常
			throw AuctionException("竞拍价必须是数值，"
				+ "不能包含其他字符！")
		}
		if (initPrice > d){
			throw AuctionException("竞拍价比起拍价低，"
				+ "不允许竞拍！")
		}
		initPrice = d
	}
}
fun main(args: Array<String>) {
	val at = AuctionTest()
	try{
		at.bid("df")
	}catch (ae: AuctionException){
		// 再次捕获到bid()方法中的异常，并对该异常进行处理
		println(ae.message)
	}
}