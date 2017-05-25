package chapter15.test9;

import java.util.List;

import chapter15.test8.Apple;
import chapter15.test8.Fruit;
import chapter15.test8.Jonathan;

public class SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples){
		apples.add(new Apple());
		apples.add(new Jonathan());
		//The method add(capture#3-of ? super Apple) in the type List<capture#3-of ? super 
		 //Apple> is not applicable for the arguments (Fruit)
		//apples.add(new Fruit());
	}
}
