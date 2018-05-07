

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
public class GenericVarintTest{
	public static void main(String[] args){
		Base bs = new Base();
		Sub sub = new Sub();
		Box<Base> baseBox = new Box<>(bs);
		Box<Sub> subBox = new Box<>(sub);
		System.out.println(GenericVariantKt.unboxBase(subBox));
	}
}
