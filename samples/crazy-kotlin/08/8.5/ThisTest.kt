

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
class A { // ��ʽ��ǩ @A
	inner class B { // ��ʽ��ǩ @B
		// ΪInt��չfoo()����
		fun Int.foo() { // ��ʽ��ǩ @foo
			val a = this@A // A �� this
			val b = this@B // B �� this
			val c = this // ������ǩ��this��Ĭ�ϴ���÷�����������:Int����
			val c1 = this@foo // ��ʽָ��@foo��ǩ����c����Ķ�����ͬ
			println(a)
			println(b)
			println(c)
			println(c1)
			// ΪString��չfunLit()����
			val funLit = lambda@ fun String.() {
				val d = this // ������ǩ��this��Ĭ�ϴ���÷�����������:String����
				val d1 = this@lambda // ��ʽָ��@lambda��ǩ����d����Ķ�����ͬ
				println(d)
				println(d1)
			}
			"fkit".funLit()
			// ֱ�Ӷ���һ��Lambda���ʽ��û�н�����
			val funLit2 = {
				// ��this���ڵ�Lambda���ʽû�н����ߣ���˵�ǰ��Χû��this
				// ϵͳ��������Lambda���ʽ���ڷ�Χ��Ѱthis��
				// �ʴ˴�this������foo()�����Ľ����ߣ�Int����
				val e = this
				val e1 = this@foo // ��ʽָ��@foo��ǩ����e����Ķ�����ͬ
				println("foo()������Lambda���ʽ��this��" + e)
				println("e1��this��" + e1)
			}
			funLit2()
		}
		fun testB(){
			// ����2��Intֵ����foo()����
			2.foo()
		}
	}
	fun testA(){
		var bObj = B()
		println("���򴴽���B����${bObj}")
		bObj.testB()
	}
}
fun main(args: Array<String>) {
	var aObj = A()
	println("���򴴽���A����${aObj}")
	aObj.testA()
}