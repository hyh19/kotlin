

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
import kotlin.reflect.*
import java.awt.event.*
// ָ����ע��ֻ����������
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
// ����һ�����ԣ���������Ԫ����
// ��listener�������ڱ��������ʵ����
annotation class ActionListenerFor(
	val listener: KClass<out ActionListener>)
