

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

data class Point(val x: Int, val y: Int){
	// ΪPoint�ඨ��һ��minus()����
	operator fun minus(target: Point): Double{
		return Math.hypot((this.x - target.x).toDouble()
			, (this.y - target.y).toDouble())
	}
}
// ����չ��������ʽΪPoint�ඨ��times()����
operator fun Point.times(target: Point): Int {
	return Math.abs(this.x - target.x) *
		Math.abs(this.y - target.y)
}
fun main(args: Array<String>) {
	var p1 = Point(4, 10) 
	var p2 = Point(5, 15)
	var distance = p1 - p2;
	println("p1��p2�ľ���Ϊ��${distance}")
	var area = p1 * p2
	println("p1��p2Χ�ɾ��ε����Ϊ��${area}")
}