

/**
 * Description:<br>
 * 网站: <a href="http://www.crazyit.org">疯狂Java联盟</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class StaticMethodTest{
	public static void main(String[] args){
		// 通过INSTANCE访问MyObject的单例，通过单例访问test()方法
		MyObject.INSTANCE.test();
		// 错误，test()方法只是单例对象的实例方法
//		MyObject.test();
		// 通过INSTANCE访问MyObject的单例，通过单例访问foo()方法
		MyObject.INSTANCE.foo();
		// 正确，foo()方法有@JvmStatic修饰，因此也是MyObject类的类方法
		MyObject.foo();
		// 通过Companion访问MyClass的伴生对象，通过伴生对象访问test()方法
		MyClass.Companion.test();
		// 错误，test()方法只是伴生对象的实例方法
//		MyClass.test();
		// 通过Companion访问MyClass的伴生对象，通过伴生对象访问output()方法
		MyClass.Companion.output("疯狂软件");
		// 正确，output()方法有@JvmStatic修饰，因此也是MyClass类的类方法
		MyClass.output("疯狂软件");
	}
}
