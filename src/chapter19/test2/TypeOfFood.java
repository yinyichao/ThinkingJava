package chapter19.test2;

import chapter19.test2.Food.Appetizer;
import chapter19.test2.Food.Coffee;
import chapter19.test2.Food.Dessert;
import chapter19.test2.Food.MainCourse;

public class TypeOfFood {
	public static void main(String[] args) {
		Food food = Appetizer.SALAD;
		food = MainCourse.LASAGNE;
		food = Dessert.GELATO;
		food = Coffee.CAPPUCCINO;
	}
}
