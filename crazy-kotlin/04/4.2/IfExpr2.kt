

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
	var age = 18
	// ��if���ʽ��ֵ��str����
	var str = if (age > 20) {
		println("����20�ķ�֧")
		"age����20"
	} else if(age < 20) {
		println("С��20�ķ�֧")
		"ageС��20"
	} else {
		println("else�ķ�֧")
		"age����20"
	}
	println(str)
}