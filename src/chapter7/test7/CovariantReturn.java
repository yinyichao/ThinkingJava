package chapter7.test7;

import chapter7.test8.test;

public class CovariantReturn implements test{
	public static void main(String[] args) {
		System.out.println(i);
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}
