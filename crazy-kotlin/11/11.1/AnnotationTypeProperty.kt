

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
// �����value���Ե�ע��
annotation class MyTag(val value:String)

// ��ע���target���Ե�������MyTag
annotation class ShowTag(val message: String,
	val target: MyTag)

@ShowTag("message����ֵ", target = MyTag("yeeku"))
class Circle