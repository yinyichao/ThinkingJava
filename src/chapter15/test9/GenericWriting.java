package chapter15.test9;

import java.util.ArrayList;
import java.util.List;

import chapter15.test8.Apple;
import chapter15.test8.Fruit;

public class GenericWriting {
	static <T> void writeExact(List<T> list,T item){
		list.add(item);
	}
	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();
	static void f1(){
		writeExact(apples, new Apple());
	}
	static <T> void writeWithWildcard(List<? super T>list,T item){
		list.add(item);
	}
	static void f2(){
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());
	}
	public static void main(String[] args) {
		f1();
		f2();
	}
}
