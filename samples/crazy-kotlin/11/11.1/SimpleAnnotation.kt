

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
// ����һ���򵥵���ע��
annotation class Test

// ʹ��@Test�����ඨ��
@Test class MyClass{
	// ʹ��@Testע����������
	@Test var name: String = ""
	// ʹ��@Testע�����η���
	@Test fun info(){
//		...
	}
//	...
}

class User @Test constructor(var name: String, var pass: String){
}