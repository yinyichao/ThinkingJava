package chapter15.test7;

public class InheritBounds {
	public static void main(String[] args) {
		Solid2<Bounded> solid2 = new Solid2<Bounded>(new Bounded());
		System.out.println(solid2.color());
		System.out.println(solid2.getY());
		System.out.println(solid2.weight());
		solid2.color();
		solid2.getY();
		solid2.weight();
	}
}
