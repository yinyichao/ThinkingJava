package chapter21.test4;

public class Joining {
	public static void main(String[] args) {
		Sleeper
			sleeper = new Sleeper("Sleepy", 1500),
			grumpy = new Sleeper("Grumpy", 1500);
		Joiner
			dopey = new Joiner("Dopey", sleeper),
			doc = new Joiner("Doc", grumpy);
		grumpy.interrupt();
	}
}
