

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
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // Ĭ����public����
    
    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a���ɷ���
    // b��c��d�ɷ���
    // Nested��e�ɷ���

    override val b = 5   // ����д��b��Ȼ��protected����
}

class Other(o: Outer) {
    // o.a��o.b���ɷ���
    // o.c��Other����ͬһģ�飬���Է���
	// o.d�ɷ���
    // Outer.Nested���ɷ��ʣ�Nested::eҲ���ɷ���
}