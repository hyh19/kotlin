

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
fun main(args: Array<String>) {
	var age = 30
	if (age > 20) {
	// ֻ�е�age > 20ʱ�����滨����������������Ż�ִ��
	// �������������������һ�����壬Ҫôһ��ִ�У�Ҫôһ�𲻻�ִ��
		println("�����Ѿ�����20����")
		println("20�����ϵ���Ӧ��ѧ��е�����...")
	}

	// �������a����Ϊ�丳ֵ
	val a = 5
	if (a > 4)
		// ���a>4����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
		println("a����4")
	else
		// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
		println("a������4")


	// �������b����Ϊ�丳ֵ
	var b = 5
	if (b > 4)
		// ���b>4����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
		out.println("b����4")
	else
		// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
		b--
		//�������������ԣ����Ѿ�����������ִ�����һ���֣�����ܻ�ִ��
		out.println("b������4")


// �������c����Ϊ�丳ֵ
var c = 5
if (c > 4)
	// ���c>4����ִ�������ִ���壬��ֻ��c--;һ�д���Ϊִ����
	c--
	// ������һ����ͨ���룬������ִ����
	println("c����4")
// �˴���else��û��if��䣬��˱������
else
	// ����ִ�������ִ���壬ֻ��һ�д�����Ϊ�����
	println("c������4")


}