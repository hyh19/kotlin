

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
open class Item{
	open protected var price: Double = 10.9
	open val name: String = ""
	open var validDays: Int = 0
}
class Book: Item{
	// ��ȷ��д�˸�������ԣ����ͼ��ݣ�����Ȩ�޸���
	override public var price: Double
	// ��ȷ��д�˸�������ԣ���д������дֻ������
	override var name = "ͼ��"
	// ��д����ֻ�����Բ�����д��д����
	open val validDays: Int = 2
	constructor(){
		price = 3.0
	}
}
