

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
public class InvokeExtension{
	public static void main(String[] args){
		// 创建Raw对象
		Raw t = new Raw();
		// 调用Raw对象的成员方法
		t.test();
		// 调用Raw对象的扩展方法，需要自己解析成调用扩展函数
		Raw_infoKt.info(t);
		// 创建RawSub对象
		RawSub rs = new RawSub();
		// 调用RawSub对象的成员方法
		rs.test();
		rs.sub();
		// 调用RawSub对象的扩展方法，需要自己解析成调用扩展函数
		Raw_infoKt.info(rs);
	}
}
