

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
	var mutableMap = mutableMapOf("OC" to 96, "PHP" to 3400, 
		"Perl" to 4300 , "Ruby" to 5600 , "Go" to 5600)
	// �Է������﷨����key-value��
	mutableMap["Swift"] = 9000
	// ��put��������key-value��
	mutableMap.put("OC" , 8600)
	// �������{OC=8600, PHP=3400, Perl=4300, Ruby=5600, Go=5600, Swift=9000}
	println(mutableMap)
	// ɾ��keyΪ"PHP"��key-value��
	mutableMap.remove("PHP")
	// ɾ��keyΪ"Perl"��key-value��
	mutableMap.remove("Perl")
	// ���������{OC=8600, Ruby=5600, Go=5600, Swift=9000}
	println(mutableMap)
	println(mutableMap.size)  // ���4
	// ɾ������Ԫ��
	mutableMap.clear()
	println(mutableMap)  // ���{}
	println(mutableMap.size)  // ���0
}