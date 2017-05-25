package chapter15.test4;

import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {
	public static void main(String[] args) {
		Set<Watercolors> set1 = EnumSet.range(Watercolors.ZINC, Watercolors.MAGENTA);
		Set<Watercolors> set2 = EnumSet.range(Watercolors.LEMON_YELLOW, Watercolors.ORANGE);
		System.out.println("set1"+set1);
		System.out.println("set2"+set2);
		System.out.println("union(set1,set2)"+Sets.union(set1,set2));
		System.out.println("intersection(set1,set2)"+Sets.intersection(set1,set2));
		System.out.println("difference(set1,set2)"+Sets.difference(set1,set2));
		System.out.println("complement(set1,set2)"+Sets.complement(set1,set2));
	}
}
