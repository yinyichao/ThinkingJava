package chapter11.test2;

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(1);
		list2.add(4);
		list2.add(5);
//		list1.retainAll(list2);
//		System.out.println(list1);
		list1.set(1, 22);
		System.out.println(list1);
		Integer[] a = list1.toArray(new Integer[0]);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		list1.clear();
		System.out.println(list1);
	}
}
