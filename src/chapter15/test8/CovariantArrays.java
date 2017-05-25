package chapter15.test8;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		//fruit[0] = new Fruit();
		//fruit[0] = new Orange();
		//Type mismatch: cannot convert from ArrayList<Apple> to List<Fruit>
		//List<Fruit> f = new ArrayList<Apple>();
	}
}
