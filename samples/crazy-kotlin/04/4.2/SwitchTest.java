

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
public class SwitchTest {
	public static void main(String[] args) {
		char score = 'B';
		switch(score) {
			case 'A':
				System.out.println("优秀");
				break;
			case 'B':
				System.out.println("良好");
				break;
			case 'C':
				System.out.println("中");
				break;
			case 'D':
				System.out.println("及格");
				break;
			default :
				System.out.println("不及格");
		}
	}
}
