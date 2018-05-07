

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
class Name(name: String, desc: String){
	var name = name;
	var desc = desc;
}
class Product{
	var productor: String? = null
	// inline修饰属性的getter方法，表明读取属性时会内联化
	val proName: Name
		inline get() = Name("疯狂Kotlin讲义", "最系统的Kotlin书")
	// inline修饰属性的setter方法，表明设置属性时会内联化
	var author: Name
		get() = Name("李刚", "无")
		inline set(v){
			this.productor = v.name
		}
	// inline修饰属性本身，表明读取属性和设置属性时都会内联化
	inline var pubHouse: Name
		get() = Name("电子工业出版社", "无")
		set(v){
			this.productor = v.name
		}
}