

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
public class InstanceFieldTest{
	public static void main(String[] args){
		InstanceField ins = new InstanceField("Kotlin");
		// 访问InstanceField对象的实例变量
		System.out.println(ins.myName);
	}
}
