

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
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
			// �˴���ɱ������п��Զ��쳣ִ�е��޸�����
			// �˴��������ڿ���̨��ӡ�쳣�ĸ���ջ��Ϣ
			e.printStackTrace()
			// �ٴ��׳��Զ����쳣
			throw AuctionException("���ļ۱�������ֵ��"
				+ "���ܰ��������ַ���")
		}
		if (initPrice > d){
			throw AuctionException("���ļ۱����ļ۵ͣ�"
				+ "�������ģ�")
		}
		initPrice = d
	}
}
fun main(args: Array<String>) {
	val at = AuctionTest()
	try{
		at.bid("df")
	}catch (ae: AuctionException){
		// �ٴβ���bid()�����е��쳣�����Ը��쳣���д���
		println(ae.message)
	}
}