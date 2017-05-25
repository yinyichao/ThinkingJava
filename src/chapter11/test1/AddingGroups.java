package chapter11.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
	/**
	 * Collection.addAll()方法运行起来要快得多，
	 * 而且构建一个不包含元素的Collection，然后调用Collections.addAll()
	 * 这种方式很方便，因此他是首选方式
	 */
	public static void main(String[] args) {
		/*Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Integer[] moreInts = {6,7,8,9,10};
		Collections.addAll(collection, 11,12,13,14,15);
		Collections.addAll(collection, moreInts);
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		list.set(1, 99);*/
		//Arrays.asList(16,17,18,19,20)
		//底层表示的是数组，因此不能修改尺寸
		List<Integer> list = Arrays.asList(16,17,18,19,20);
		for (Integer in : list) {
			System.out.println(in);
		}
		//Exception in thread "main" java.lang.UnsupportedOperationException
		list.add(1);
		list.remove(0);
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		for(Integer in :list){
			System.out.println(in);
		}
		list.remove(1);
		for(Integer in :list){
			System.out.println(in);
		}*/
	}
}
