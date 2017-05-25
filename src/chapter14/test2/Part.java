package chapter14.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Part {
	public String toString(){
		return getClass().getSimpleName();
	}
	static List<Factory<? extends Part>> partFactories = new ArrayList<Factory<? extends Part>>();
	static{
		partFactories.add(new FuelFilter.Factory());
	}
	private static Random rand = new Random(47);
	public static Part createRandom(){
		int n = rand.nextInt(partFactories.size());
		return partFactories.get(n).create();
	}
}
