

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
interface Outputable {
	fun output(msg: String)
	var type: String
}
// ����һ��DefaultOutput��ʵ��Outputable�ӿ�
class DefaultOutput: Outputable{
	override fun output(msg: String){
		for (i in 1..6) {
			println("<h${i}>${msg}</h${i}>")
		}
	}
	override var type: String = "����豸"
}
// ����PrinterΪ��ָ���������b��Ϊί�ж���
class Printer(b: DefaultOutput): Outputable by b
// ����ProjectorΪ��ָ���½��Ķ�����Ϊί�ж���
class Projector(): Outputable by DefaultOutput(){
	// ������дoutput()����
	override fun output(msg: String){
		javax.swing.JOptionPane.showMessageDialog(null, msg);
	}
}
fun main(args: Array<String>) {
	val output = DefaultOutput()
	// Printer�����ί�ж�����output
	var printer = Printer(output)
	 // ��ʵ���ǵ���ί�ж���output()����
	printer.output("fkit.org")
	 // ��ʵ���ǵ���ί�ж���type���Է���
	println(printer.type)
	// Projector�����ί�ж���Ҳ��output
	var projector = Projector()
	// Projector������д��output()���������Դ˴��ǵ��ñ�����д�ķ���
	projector.output("��������������")
	// ��ʵ���ǵ���ί�ж���type���Է���
	println(projector.type)
}