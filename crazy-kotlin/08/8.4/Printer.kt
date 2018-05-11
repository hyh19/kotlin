

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
// ����һ��Product�ӿ�
interface Product{
	fun getProduceTime(): Int
}
const val MAX_CACHE_LINE = 10
// ��Printer��ʵ��Outputable��Product�ӿ�
class Printer: Outputable, Product{
	private val printData
		= Array<String>(MAX_CACHE_LINE, {""})
	// ���Լ�¼��ǰ���ӡ����ҵ��
	private var dataNum = 0
	// ��д�ӿڵĳ���ֻ������
	override val brand: String = "HP"
	// ��д�ӿڵĳ����д����
	override var category: String = "�������"
	override fun out(){
		// ֻҪ������ҵ���ͼ�����ӡ
		while(dataNum > 0){
			println("��ӡ����ӡ��" + printData[0])
			// ����ҵ��������ǰ��һλ������ʣ�µ���ҵ����1
			System.arraycopy(printData , 1
				, printData, 0, --dataNum)
		}
	}
	override fun getData(msg: String){
		if (dataNum >= MAX_CACHE_LINE){
			println("����������������ʧ��")
		} else {
			// �Ѵ�ӡ������ӵ�������ѱ������ݵ�������1
			printData[dataNum++] = msg
		}
	}
	override fun getProduceTime(): Int{
		return 45
	}
}
fun main(args: Array<String>){
	// ����һ��Printer���󣬵���Outputʹ��
	var o: Outputable = Printer()
	o.getData("������Java EE��ҵӦ��ʵս")
	o.getData("���Java����")
	o.out()
	o.getData("���Android����")
	o.getData("���Ajax����")
	o.out()
	// ����Outputable�ӿ��ж����Ĭ�Ϸ���
	o.print("�����" , "��˽�" , "�׹Ǿ�")
	o.test()
	// ����һ��Printer���󣬵���Productʹ��
	val p: Product = Printer()
	println(p.getProduceTime())
	// ���нӿ����͵����ñ�������ֱ�Ӹ���Any���͵ı���
	val obj: Any = p
}