

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
import java.util.*;
public class JavaNoVariance
{
	public static void main(String[] args)
	{
		List<String> strs = new ArrayList<>();
		// 下面代码实际上会导致编译错误
		List<Object> objs = strs;
		// 如果上面代码可以通过，这行代码就会引发异常
		// 因为objs引用的集合元素实际上必须是String
		objs.add(20);

	}
}
