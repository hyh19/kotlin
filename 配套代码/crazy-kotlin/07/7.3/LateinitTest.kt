

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
import java.util.Date
class User{
	// �ӳٳ�ʼ������
	lateinit var name: String
	lateinit var birth: Date
}
fun main(args: Array<String>){
	var user = User()
//	println(user.name)
//	println(user.birth)
	user.name = "�����"
	user.birth = Date()
	println(user.name)
	println(user.birth)
}