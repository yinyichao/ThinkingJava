package chapter15.test5;

import java.util.ArrayList;

import chapter15.test3.Generator;
import chapter15.test3.Generators;

public class Shelf extends ArrayList<Product>{
	public Shelf(int nProduct){
		Generators.fill(this, Product.generator, nProduct);
	}
}
