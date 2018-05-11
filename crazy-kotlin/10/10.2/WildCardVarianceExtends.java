

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
public class WildCardVarianceExtends {
	public static void main(String[] args) {
		Set<Number> numSet = new HashSet<>();
		Set<Integer> intSet = new HashSet<>();
		intSet.add(2);
		intSet.add(3);
		// addAll(Collection<? extends E> c)ʹ��?֧���ͱ�
		numSet.addAll(intSet); // �˴�֧���ͱ䣺intSet�ܱ�����numSet
		Set<Double> doubleSet = new HashSet<>();
		doubleSet.add(2.3);
		doubleSet.add(4.3);
		// addAll(Collection<? extends E> c)ʹ��?֧���ͱ�
		numSet.addAll(doubleSet); // �˴�֧���ͱ䣺doubleSet�ܱ�����numSet
		System.out.println(numSet);
	}
}
