package chapter7.test2;

public class Soap {
	private String s;
	Soap(){
		System.out.println("Soap");
		s = "Constructed";
	}
	public String toString(){
		return s;
	}
}
