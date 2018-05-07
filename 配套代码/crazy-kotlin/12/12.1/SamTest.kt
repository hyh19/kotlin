

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
import java.util.function.*
import java.util.concurrent.*
fun main(args: Array<String>) {
	// ʹ��Lambda���ʽ����������ʽ�ӿڣ�Predicate���Ķ���
	val pred = Predicate<Int>{t -> t > 5}
	val list = arrayListOf(2, 200, 10, 34, 30, 44)
	// ʹ��pred��List���Ͻ��й���
	list.removeIf(pred)
	println(list) // ���[2]
	// ʹ��Lambda���ʽ����������ʽ�ӿڣ�Runnable���Ķ���
	val rn = Runnable{
		for (i in 0..10) {
			println(i)
		}
	}
	// ͨ��Runnable���󴴽��������߳�
	Thread(rn).start()
	val executor = ThreadPoolExecutor()
	// ����executor��execute()������Ҫһ��Runnable����
	// ��˳�����Զ������ϸýӿڹ淶��Lambda���ʽ������Runnable����
	executor.execute { println("This runs in a thread pool") }
	// ��ȻҲ���ڷ�������ʽָ��Lambda���ʽ��������Runnable����
	executor.execute(Runnable { println("This runs in a thread pool") })
}