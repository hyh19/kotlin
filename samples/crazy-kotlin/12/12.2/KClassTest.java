

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
import java.util.ArrayList;
import kotlin.reflect.*;
public class KClassTest{
	public static void main(String[] args)throws Exception{
		Class<?> clazz = Class.forName("java.util.ArrayList");
		System.out.println(clazz);
		// ��ȡClass�����KClass����
		KClass kc = kotlin.jvm.JvmClassMappingKt.getKotlinClass(clazz);
		System.out.println(kc);
	}
}
