package chapter15.test8;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
	public static void main(String[] args) {
		List<? extends Fruit> flist = new ArrayList<Apple>();
		//The method add(capture#1-of ? extends Fruit) in the type List<capture#1-of ? extends 
		//Fruit> is not applicable for the arguments (Apple)
		//flist.add(new Apple());
		//对接、ejy、接口想法
		//The method add(capture#1-of ? extends Fruit) in the type List<capture#1-of ? extends Fruit> is not applicable for the arguments (Apple)
		//flist.add(new Apple());
		flist.add(null);
		Fruit f = flist.get(0);
	}
}
