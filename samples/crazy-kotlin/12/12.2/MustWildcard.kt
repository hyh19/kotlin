
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
open class Base
class Sub: Base()
class Box<out T>(val value: T)

// �Է���ֵ����ǿ������ͨ���
fun boxSub(value: Sub): Box<@JvmWildcard Sub> = Box(value)
fun unboxBase(box: Box<Base>): Base = box.value