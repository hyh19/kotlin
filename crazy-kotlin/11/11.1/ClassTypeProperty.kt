

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
// arg1��������KClass<*>�������Ǻ�ͶӰ�÷����൱��Java��ԭʼ����
// arg2��������KClass<out Any>������ʹ�ô�Э����÷���
// �ɴ���KClass<Int>��KClass<String>�ȣ�ֻҪ���������������Any�����༴��
annotation class DrawTag(val arg1: KClass<*>,
	val arg2: KClass<out Any>)
@DrawTag(arg1=String::class, arg2=Int::class)
class Circle