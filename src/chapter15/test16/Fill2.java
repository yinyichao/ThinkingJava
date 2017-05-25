package chapter15.test16;

import chapter15.test3.Generator;

public class Fill2 {
	public static <T> void fill(Addable<T> addable,Class<? extends T>classToken,int size){
		for (int i = 0; i < size; i++) {
			try{
				addable.add(classToken.newInstance());
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		}
	}
	public static<T>void fill(Addable<T> addable,Generator<T> generator,int size){
		for (int i = 0; i < size; i++) {
			addable.add(generator.next());
		}
	}
}
