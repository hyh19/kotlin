

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
	var languages = mutableSetOf("Kotlin", "OC", "PHP", "Perl" , "Ruby" , "Go")
	// ɾ��"PHP"
	languages.remove("PHP")
	// �ٴ�ɾ��"Perl"
	languages.remove("Perl")
	println(languages)  // ���[Kotlin, OC, Ruby, Go]
	// ����ɾ�����Ԫ��
	languages.removeAll(setOf("Ruby", "Go"))
	println(languages)  // ���[Kotlin, OC]
	// ���Set����
	languages.clear()
	println(languages.count())  // ���0


var set = mutableSetOf("aa", "eyz" , "abc")
var it = set.iterator() // ����MutableIterator
while(it.hasNext()){
	var e = it.next()
	println(e)
	// ����ʱɾ��Ԫ��
	if(e.length < 3) {
		it.remove()
	}
}
println(set) // ���["eyz" , "abc"]
}