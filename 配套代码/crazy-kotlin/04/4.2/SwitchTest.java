

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */
public class SwitchTest {
	public static void main(String[] args) {
		char score = 'B';
		switch(score) {
			case 'A':
				System.out.println("����");
				break;
			case 'B':
				System.out.println("����");
				break;
			case 'C':
				System.out.println("��");
				break;
			case 'D':
				System.out.println("����");
				break;
			default :
				System.out.println("������");
		}
	}
}
