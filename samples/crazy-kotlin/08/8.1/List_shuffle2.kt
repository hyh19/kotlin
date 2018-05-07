

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
// 该方法的实现思路是：先生成List集合所有索引的随机排列
// 然后根据随机排列的索引去List集合中取元素
fun <T> List<T>.shuffle(): List<T>{
	val size = this.size
	// 下面indexArr用于保存List集合的索引的随机排列
	var indexArr = Array<Int>(size, {0})
	var result: MutableList<T> = mutableListOf()
	// 创建随机对象
	val rand = java.util.Random()
	var i = 0
	outer@ while (i < size ) {
		// 生成随机数
		var r = rand.nextInt(size)
		for (j in 0 until i) {
			// 如果r和前面已生成的任意数字相等，该随机数不可用，需要重新生成
			if (r == indexArr[j]) {
				continue@outer
			}
		}
		// 如果上面循环结束都没有执行continue，说明该r是一个不重复的随机数
		// 将随机数r存入indexArray数组
		indexArr[i] = r
		// 根据随机的索引读取List集合元素，将元素添加到result集合中
		result.add(this[r])
		i++
	}
	return result.toList()
}