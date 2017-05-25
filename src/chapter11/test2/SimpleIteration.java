package chapter11.test2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public interface SimpleIteration {
	public static void main(String[] args) {
		List<Integer> pets = new ArrayList<Integer>();
		pets.add(0);
		pets.add(10);
		pets.add(110);
		pets.add(1110);
		Iterator<Integer> it = pets.iterator();
		while(it.hasNext()){
			Integer pet = it.next();
			System.out.println(pet);
		}
		for (Integer i : pets) {
			System.out.println(i);
		}
		it = pets.iterator();
		for (int i = 0; i < 4; i++) {
			it.next();
			it.remove();
		}
		System.out.println(pets);
	}
}
