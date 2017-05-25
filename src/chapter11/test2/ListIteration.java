package chapter11.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
	public static void main(String[] args) {
		List<Integer> pets = new ArrayList<Integer>();
		pets.add(1);
		pets.add(2);
		pets.add(7);
		pets.add(4);
		ListIterator<Integer> it = pets.listIterator();
		while(it.hasNext()){
			System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex());
		}
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}
}
