

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
public class User{
	private String name;
	// name��setter��getter����
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	// married��setter��getter����
	public void setMarried(boolean married){
		System.out.println("����setMarried����������Ϊ��" + married);
	}
	public boolean isMarried(){
		return true;
	}
	public int getAge(){
		return new java.util.Random().nextInt(100);
	}
}