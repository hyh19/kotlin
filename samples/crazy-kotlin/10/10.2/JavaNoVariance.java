

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
public class JavaNoVariance
{
	public static void main(String[] args)
	{
		List<String> strs = new ArrayList<>();
		// �������ʵ���ϻᵼ�±������
		List<Object> objs = strs;
		// �������������ͨ�������д���ͻ������쳣
		// ��Ϊobjs���õļ���Ԫ��ʵ���ϱ�����String
		objs.add(20);

	}
}
