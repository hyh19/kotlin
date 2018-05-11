

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
public class Address{
    private String street: String;
    private String city;
    private String province;
    private String postCode;

	// �޲����Ĺ�����
	public Address(){
	}
	// city��setter��getter����
	public final void setCity(String city){
		this.city = city;
	}
	public final String getCity(){
		return this.city;
	}

	// province��setter��getter����
	public final void setProvince(String province){
		this.province = province;
	}
	public final String getProvince(){
		return this.province;
	}

	// postCode��setter��getter����
	public final void setPostCode(String postCode){
		this.postCode = postCode;
	}
	public final String getPostCode(){
		return this.postCode;
	}
}