package chapter19.test3;

import java.util.EnumSet;
import static chapter19.test3.AlarmPoints.*;
public class EnumSets {
	public static void main(String[] args) {
		EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
		points.add(BATHROOM);
		System.out.println(points);
		points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		System.out.println(points);
		points = EnumSet.allOf(AlarmPoints.class);
		System.out.println(points);
		points.removeAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));
		System.out.println(points);
		points.removeAll(EnumSet.of(OFFICE1,OFFICE4));
		System.out.println(points);
		points = EnumSet.complementOf(points);
		System.out.println(points);
	}
}
