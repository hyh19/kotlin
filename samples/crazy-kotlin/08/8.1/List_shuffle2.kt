

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
// �÷�����ʵ��˼·�ǣ�������List���������������������
// Ȼ�����������е�����ȥList������ȡԪ��
fun <T> List<T>.shuffle(): List<T>{
	val size = this.size
	// ����indexArr���ڱ���List���ϵ��������������
	var indexArr = Array<Int>(size, {0})
	var result: MutableList<T> = mutableListOf()
	// �����������
	val rand = java.util.Random()
	var i = 0
	outer@ while (i < size ) {
		// ���������
		var r = rand.nextInt(size)
		for (j in 0 until i) {
			// ���r��ǰ�������ɵ�����������ȣ�������������ã���Ҫ��������
			if (r == indexArr[j]) {
				continue@outer
			}
		}
		// �������ѭ��������û��ִ��continue��˵����r��һ�����ظ��������
		// �������r����indexArray����
		indexArr[i] = r
		// ���������������ȡList����Ԫ�أ���Ԫ����ӵ�result������
		result.add(this[r])
		i++
	}
	return result.toList()
}