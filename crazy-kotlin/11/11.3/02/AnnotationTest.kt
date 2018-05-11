

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
import javax.swing.*
import java.awt.event.*
class AnnotationTest{
	val mainWin = JFrame("ʹ��ע����¼�������")
	// ʹ��ע��Ϊok��ť���¼�������
	@ActionListenerFor(listener=OkListener::class)
	val ok = JButton("ȷ��")
	// ʹ��ע��Ϊcancel��ť���¼�������
	@ActionListenerFor(listener=CancelListener::class)
	val cancel = JButton("ȡ��")
	fun init(){
		// ��ʼ������ķ���
		val jp = JPanel()
		jp.add(ok)
		jp.add(cancel)
		mainWin.add(jp)
		processAnnotations(this)  // ��
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		mainWin.pack()
		mainWin.setVisible(true)
	}
}
// ����ok��ť���¼�������ʵ����
class OkListener: ActionListener{
	override fun actionPerformed(evt: ActionEvent){
		JOptionPane.showMessageDialog(null, "������ȷ�ϰ�ť")
	}
}
// ����cancel��ť���¼�������ʵ����
class CancelListener: ActionListener{
	override fun actionPerformed(evt: ActionEvent){
		JOptionPane.showMessageDialog(null, "������ȡ����ť")
	}
}
fun main(args: Array<String>) {
	AnnotationTest().init()
}

