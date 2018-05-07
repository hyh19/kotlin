

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
import kotlin.reflect.full.*
// ����ע��
annotation class Anno
// ʹ��3��ע�����θ���
@Deprecated("�����Ѿ����Ƽ�ʹ��")
@Anno
@Suppress("UNCHECKED_CAST")
class ClassTest(age: Int){
	var name: String = "Kotlin"
	// Ϊ���ඨ��һ��˽�еĹ�����
	private constructor(): this(20){	
	}
	// ����һ���в����Ĺ�����
	constructor(name: String): this(15){
		println("ִ���в����Ĺ�����:${name}")
	}
	// ����һ���޲�����info����
	fun info(){
		println("ִ���޲�����info����")
	}
	// ����һ���в�����info����
	fun info(str: String){
		println("ִ���в�����info����"
			+ "����str����ֵ��" + str)
	}
	// ����һ�������õ�Ƕ����
	class Inner
}
// ΪClassTest������չ����
fun ClassTest.bar() {
	println("��չ��bar����")
}
// ΪClassTest������չ����
val ClassTest.foo: Double
	get() = 2.4
fun main(args: Array<String>) {
	// ���������Ի�ȡClassTest��Ӧ��KClass
	val clazz = ClassTest::class
	// ͨ��constructors���Ի�ȡKClass��������Ӧ���ȫ��������
	val ctors = clazz.constructors;
	println("ClassTest��ȫ�����������£�")
	ctors.forEach { println(it) }
	println("ClassTest�������������£�")
	println(clazz.primaryConstructor)

	// ͨ��functions���Ի�ȡ��KClass��������Ӧ���ȫ������
	var funs = clazz.functions
	println("ClassTest��ȫ���������£�")
	funs.forEach { println(it) }

	/*
	ͨ��declaredFunctions���Ի�ȡ��KClass����
	������������ȫ���������������̳еķ����� */
	var funs2 = clazz.declaredFunctions
	println("ClassTest����������ȫ���������£�")
	funs2.forEach { println(it) }

	/*
	ͨ��declaredMemberFunctions���Ի�ȡ��KClass����
	������������ȫ����Ա�������������̳еķ����� */
	var memberFunctions = clazz.declaredMemberFunctions
	println("ClassTest���������ĳ�Ա�������£�")
	memberFunctions.forEach { println(it) }

	/*
	ͨ��memberExtensionFunctions���Ի�ȡ��KClass����
	���������ȫ����չ�������������̳еķ����� */
	var extensionFunctions = clazz.memberExtensionFunctions
	println("ClassTest����չ�������£�")
	extensionFunctions.forEach { println(it) }

	/*
	ͨ��declaredMemberProperties���Ի�ȡ��KClass����
	������������ȫ����Ա���ԣ��������̳е����ԣ� */
	var memberProperties = clazz.declaredMemberProperties
	println("ClassTest���������ĳ�Ա�������£�")
	memberProperties.forEach { println(it) }

	/*
	ͨ��memberExtensionProperties���Ի�ȡ��KClass����
	���������ȫ����չ���ԣ��������̳е����ԣ� */
	var extensionProperties = clazz.memberExtensionProperties
	println("ClassTest����չ�������£�")
	extensionProperties.forEach { println(it) }

	// ͨ��annotations���Ի�ȡ��KClass��������Ӧ���ȫ��ע��
	val anns = clazz.annotations;
	println("ClassTest��ȫ��ע�����£�")
	anns.forEach { println(it) }
	println("��KClassԪ���ϵ�@Annoע��Ϊ��"
		+ clazz.findAnnotation<Anno>())
	// ͨ��nestedClasses���Ի�ȡ��KClass��������Ӧ���ȫ��Ƕ���ࣨ�����ڲ����Ƕ���ࣩ
	val inners = clazz.nestedClasses
	System.out.println("ClassTest��ȫ���ڲ������£�")
	inners.forEach { println(it) }
	// ͨ��supertypes���Ի�ȡ��������и����ͣ���������͸��ӿڣ�
	println("ClassTest�ĸ�����Ϊ��" + clazz.supertypes)
}