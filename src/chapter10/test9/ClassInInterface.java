package chapter10.test9;

public interface ClassInInterface {
	void howdy();
	static class Test implements ClassInInterface{
		@Override
		public void howdy() {
			System.out.println("Howdy!");
		}
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
