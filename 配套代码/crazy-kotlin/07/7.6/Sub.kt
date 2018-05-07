

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
open class Base{
	constructor(){
		println("Base���޲����Ĺ�����")
	}
	constructor(name: String){
		println("Base��һ��String����:${name}�Ĺ�������")
	}
}
class Sub: Base{
	// �ù�����û����ʽί�У�
	// ��˸ôι�����������ʽί�е��ø����޲����Ĺ�������
	constructor(){
		println("Sub���޲����Ĺ�����")
	}
	// ��������super(name)��ʽί�и����String�����Ĺ�����
	constructor(name: String): super(name){
		println("Sub��String��������String����Ϊ��${name}")
	}
	// ��������this(name)��ʽί�б����д�String�����Ĺ�����
	constructor(name:String, age: Int): this(name){
		println("Sub��String,Int��������Int����Ϊ��${age}")
	}
}
fun main(args: Array<String>){
	Sub() 
	Sub("Sub") 
	Sub("����", 29) 
}