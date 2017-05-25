package chapter16.test1;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfGenerics {
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = la;
		ls[0] = new ArrayList<String>();
		//Type mismatch: cannot convert from ArrayList<Integer> to List<String>
		//ls[1] = new ArrayList<Integer>();
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();

	}
}
