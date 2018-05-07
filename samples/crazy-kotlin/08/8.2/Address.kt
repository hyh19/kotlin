

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
// ����ɳ�ʼ���������ԵĹ�����
class Address(val detail:String, val postCode: String){
	// ��дequals()�������ж����������Ƿ����
	override operator fun equals(other: Any?): Boolean{
		if (this == other){
			return true
		}
		if(other == null){
			return false
		}
		if(other.javaClass == Address::class){
			var ad = other as Address
			// ��detail��postCode���ʱ������Ϊ����Address�������
			return this.detail.equals(ad.detail)
				&& this.postCode.equals(ad.postCode)
		}
		return false
	}
	override fun hashCode(): Int{
		return detail.hashCode() + postCode.hashCode() * 31
	}
}
