

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
public class InvokeExtension{
	public static void main(String[] args){
		// ����Raw����
		Raw t = new Raw();
		// ����Raw����ĳ�Ա����
		t.test();
		// ����Raw�������չ��������Ҫ�Լ������ɵ�����չ����
		Raw_infoKt.info(t);
		// ����RawSub����
		RawSub rs = new RawSub();
		// ����RawSub����ĳ�Ա����
		rs.test();
		rs.sub();
		// ����RawSub�������չ��������Ҫ�Լ������ɵ�����չ����
		Raw_infoKt.info(rs);
	}
}
