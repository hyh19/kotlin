

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
class MyTest{
	// ʹ��@Testableע��ָ���÷�������Ҫ���Ե�
	@Testable
	fun m1(){
	}
	fun m2(){
	}
	// ʹ��@Testableע��ָ���÷�������Ҫ���Ե�
	@Testable
	fun m3(){
		throw IllegalArgumentException("���������ˣ�")
	}
	fun m4(){
	}
	// ʹ��@Testableע��ָ���÷�������Ҫ���Ե�
	@Testable
	fun m5(){
	}
	fun m6(){
	}
	// ʹ��@Testableע��ָ���÷�������Ҫ���Ե�
	@Testable
	fun m7(){
		throw RuntimeException("����ҵ������쳣��")
	}
	fun m8(){
	}
}
