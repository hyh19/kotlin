

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
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
	// 初始化全部成员变量的构造器
	public Item(String barCode , String name , double price){
		this.barCode = barCode;
		this.name = name;
		this.price = price;
	}
	// barCode的getter方法
	public final String getBarCode(){
		return this.barCode;
	}
	// name的getter方法
	public final String getName(){
		return this.name;
	}
	// price的getter方法
	public final double getPrice(){
		return this.price;
	}
}