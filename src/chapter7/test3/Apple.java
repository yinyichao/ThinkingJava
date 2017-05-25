package chapter7.test3;

import chapter7.test4.Fruit;

//{CompileTimeError}
public class Apple extends Fruit{
	private final int a;
	public Apple(){
		a = 1;
	}
	/*public void test(final int i){
		i++;
	}*/
	public void hehe(){
		System.out.println("a");
	}
	//@Override
	public void getName(String name){
		System.out.println("apple"+name);
	}
	public static void main(String[] args) {
		Apple a = new Apple();
		System.out.println(a.name);
		a.getName();
		a.hehe();
	}
}
