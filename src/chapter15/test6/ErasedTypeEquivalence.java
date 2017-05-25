package chapter15.test6;

import java.util.ArrayList;

public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1==c2);
		//Particle<Long,Double> p = new Particle<Long,Double>();
	}
}
