

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class Item
{
	private String barCode;
	private String name;
	private double price;
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Item(String barCode , String name , double price){
		this.barCode = barCode;
		this.name = name;
		this.price = price;
	}
	// barCode��getter����
	public final String getBarCode(){
		return this.barCode;
	}
	// name��getter����
	public final String getName(){
		return this.name;
	}
	// price��getter����
	public final double getPrice(){
		return this.price;
	}
}