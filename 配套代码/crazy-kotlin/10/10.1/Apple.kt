

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
// ����Apple��ʱʹ���˷�������
open class Apple<T>{
	// ʹ�÷���T��������
	open var info: T?
	constructor(){
		info = null
	}
	// ���淽����ʹ�÷���T�����幹����
	constructor(info: T){
		this.info = info
	}
}
fun main(args: Array<String>) {
	// ���ڴ�������T����String�����Թ���������ֻ����String
	var a1: Apple<String> = Apple<String>("ƻ��")
	println(a1.info)
	// ���ڴ�������T����Int�����Թ���������ֻ����Int
	var a2: Apple<Int> = Apple(3)
	System.out.println(a2.info)
	// ���ڹ���������ֻ����Double�����ϵͳ���ƶϷ����β�ΪDouble����
	var a3 = Apple(5.67)
	System.out.println(a3.info)

	// ϵͳ�޷��ƶ���T�Ǻ������ͣ���˱��뱨��
//	var a4 = Apple()
}

// ���������뱨��
//class A: Apple<T>()
class A: Apple<String>()

// ʹ��Apple��ʱ��û��Ϊ����T����ʵ�ʵ����Ͳ��������뱨��
//public class A extends Apple
