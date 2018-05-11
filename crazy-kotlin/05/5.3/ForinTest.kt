

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
fun main(args: Array<String>) {
	var books = setOf("疯狂Android讲义" , 
		"疯狂iOS讲义",
		"疯狂Kotlin讲义")
	// 使用for-in循环来遍历Set
	// 其中book将会自动迭代每个Set集合的元素
	for( book in books) {
		println(book)
	}
	// 调用forEach方法来遍历Set集合
	books.forEach({println(it)})
	// 根据Set集合的索引来遍历Set集合
	for (i in books.indices) {
		println(books.elementAt(i))
	}
}