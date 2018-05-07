

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
// 定义下面的Testable注解保留到运行时
@Retention(value=AnnotationRetention.RUNTIME)
annotation class Testable

// 定义下面的Testable注解将被编译器直接丢弃
@Retention(AnnotationRetention.SOURCE)
annotation class Drawable
