

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0<br>
 */
import kotlin.reflect.*
// arg1的类型是KClass<*>，这是星号投影用法，相当于Java的原始类型
// arg2的类型是KClass<out Any>，这是使用处协变的用法，
// 可传入KClass<Int>、KClass<String>等，只要尖括号里的类型是Any的子类即可
annotation class DrawTag(val arg1: KClass<*>,
	val arg2: KClass<out Any>)
@DrawTag(arg1=String::class, arg2=Int::class)
class Circle