

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
import javax.swing.*
import java.awt.event.*
class AnnotationTest{
	val mainWin = JFrame("使用注解绑定事件监听器")
	// 使用注解为ok按钮绑定事件监听器
	@ActionListenerFor(listener=OkListener::class)
	val ok = JButton("确定")
	// 使用注解为cancel按钮绑定事件监听器
	@ActionListenerFor(listener=CancelListener::class)
	val cancel = JButton("取消")
	fun init(){
		// 初始化界面的方法
		val jp = JPanel()
		jp.add(ok)
		jp.add(cancel)
		mainWin.add(jp)
		processAnnotations(this)  // ①
		mainWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
		mainWin.pack()
		mainWin.setVisible(true)
	}
}
// 定义ok按钮的事件监听器实现类
class OkListener: ActionListener{
	override fun actionPerformed(evt: ActionEvent){
		JOptionPane.showMessageDialog(null, "单击了确认按钮")
	}
}
// 定义cancel按钮的事件监听器实现类
class CancelListener: ActionListener{
	override fun actionPerformed(evt: ActionEvent){
		JOptionPane.showMessageDialog(null, "单击了取消按钮")
	}
}
fun main(args: Array<String>) {
	AnnotationTest().init()
}

