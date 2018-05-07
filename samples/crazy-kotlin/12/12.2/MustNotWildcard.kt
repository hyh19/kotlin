

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
open class Base
class Sub: Base()
class Box<out T>(val value: T)

// 对返回值类型强制不生成通配符
fun boxSub(value: Sub): Box<Sub> = Box(value)
fun unboxBase(box: Box<@JvmSuppressWildcards Base>): Base = box.value
