package chapter15.test11;

public class Decoration {
	public static void main(String[] args) {
		TimeStamped t = new TimeStamped(new Basic());
		TimeStamped t2 = new TimeStamped(new SeriaoNumbered(new Basic()));
		SeriaoNumbered s = new SeriaoNumbered(new Basic());
		SeriaoNumbered s2 = new SeriaoNumbered(new TimeStamped(new Basic()));
	}
}
