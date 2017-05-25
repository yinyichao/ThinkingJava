package chapter16.test2;

import chapter15.test3.Generator;

public class GeneratorsTest {
	public static int size = 10;
	public static void test(Class<?> surroundingClass){
		for (Class<?> type : surroundingClass.getClasses()) {
			System.out.println(type.getSimpleName()+":");
			try {
				Generator<?> g = (Generator<?>) type.newInstance();
				for (int i = 0; i < size; i++) {
					System.out.print(g.next()+" ");
				}
				System.out.println();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		test(CountingGenerator.class);
	}
}
