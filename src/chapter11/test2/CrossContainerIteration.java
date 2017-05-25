package chapter11.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class CrossContainerIteration {
	public static void display(Iterator<Integer> it){
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> pets = new ArrayList<Integer>(Arrays.asList(5,1,2,3,4));
		display(pets.iterator());
		TreeSet a = new TreeSet(pets);
		display(a.iterator());
	}
}
