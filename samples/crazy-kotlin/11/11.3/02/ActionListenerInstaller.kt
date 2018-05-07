

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
import javax.swing.*
import kotlin.reflect.*
import kotlin.reflect.full.*
// ����ע��ķ���������obj�ǰ���ע��Ķ���
fun processAnnotations(obj: Any){
	// ��ȡobj�������
	val cl = obj::class
	// ��ȡָ��obj��������г�Ա��������ÿ����Ա
	for (prop in cl.memberProperties){
		// ��ȡ�ó�Ա��ActionListenerFor���͵�ע��
		val a = prop.findAnnotation<ActionListenerFor>()
		// ��ȡ����prop��ֵ
		val fObj = prop.call(obj)
		// ���fObj��AbstractButton��ʵ������a��Ϊnull
		if (a != null && fObj != null
			&& fObj is AbstractButton){
			// ��ȡaע�����listener����ֵ������һ���������ࣩ
			val listenerClazz = a.listener
			// ʹ�÷���������listener��Ķ���
			val al = listenerClazz.createInstance()
			// ΪfObj��ť����¼�������
			fObj.addActionListener(al)
		}
	}
}
