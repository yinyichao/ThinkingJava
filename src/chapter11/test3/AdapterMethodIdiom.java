package chapter11.test3;

import java.util.Arrays;

public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversibleArrayList<String> ral = new ReversibleArrayList<String>(
				Arrays.asList("To be or not to be".split(" ")));
		for (String string : ral) {
			System.out.println(string);
		}
		for (String string : ral.reversed()) {
			System.out.println(string);
		}
	}
}
