

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
import java.util.*;
public class NameConflictTest{
	public static void main(String[] args){
		List<String> list1 = Arrays.asList("Java",
			"Kotlin", "Erlang", "Go", "Swift");
		// ����List<String>��չ��filterValid()�ķ���
		System.out.println(NameConflictKt.filterValid(list1));
		List<Integer> list2 = Arrays.asList(200,
			34, 12, 35, -23);
		// ����List<Int>��չ��fileterValid()�����ֽ�������ΪfileterValidInt���ķ���
		System.out.println(NameConflictKt.fileterValidInt(list2));
	}
}
