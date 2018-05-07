

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
public class User{
	private String name;
	// name的setter和getter方法
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	// married的setter和getter方法
	public void setMarried(boolean married){
		System.out.println("调用setMarried方法，参数为：" + married);
	}
	public boolean isMarried(){
		return true;
	}
	public int getAge(){
		return new java.util.Random().nextInt(100);
	}
}