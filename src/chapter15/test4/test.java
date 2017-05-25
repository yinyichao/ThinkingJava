package chapter15.test4;

import java.util.List;

public class test {
	public static <T> void f(T t){
		System.out.println(t);
	}
	public static <T> void g(List<T> t){
		System.out.println();
	}
	public static void g1(List<?> t){
		System.out.println();
	}
	public static void g2(List<Integer> t){
		t.add(1);
		System.out.println();
	}
	public static void main(String[] args) {
		f(10);
		f(1.0);
		f("nini");
		//.class其实是在java运行时就加载进去的
		//getClass()是运行程序时动态加载的
		Class a = Integer.class;
		test test1 = new test();
		Class b = test1.getClass();
	}
}
