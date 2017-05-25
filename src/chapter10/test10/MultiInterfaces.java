package chapter10.test10;

public class MultiInterfaces {
	static void takesA(A a){
		
	}
	static void takesB(B b){
		
	}
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}
}
