

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
public class JavaVarargs {
	// ������������ɱ�ķ���
	public void test(int... nums){
		for (int i = 0; i < nums.length ; i++ ){
			System.out.println(nums[i]);
		}
	}
}
