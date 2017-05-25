package chapter15.test7;

public class BasicBounds {
	public static void main(String[] args) {
		Solid<Bounded> solid = new Solid<Bounded>(new Bounded());
		System.out.println(solid.color());
		System.out.println(solid.getY());
		System.out.println(solid.weight());
	}
}
