

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
public class Address{
    private String street: String;
    private String city;
    private String province;
    private String postCode;

	// 无参数的构造器
	public Address(){
	}
	// city的setter和getter方法
	public final void setCity(String city){
		this.city = city;
	}
	public final String getCity(){
		return this.city;
	}

	// province的setter和getter方法
	public final void setProvince(String province){
		this.province = province;
	}
	public final String getProvince(){
		return this.province;
	}

	// postCode的setter和getter方法
	public final void setPostCode(String postCode){
		this.postCode = postCode;
	}
	public final String getPostCode(){
		return this.postCode;
	}
}