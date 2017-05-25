package chapter15.test3;

import java.util.ArrayList;
import java.util.Collection;

public class Generators {
	public static <T> Collection<T> fill(Collection<T> coll,Generator<T> gen,int n){
		for (int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Integer> fnumbers = fill(new ArrayList<Integer>(),new Fibonacci(),12);
		for (Integer i : fnumbers) {
			System.out.println(i);
		}
	}
}
