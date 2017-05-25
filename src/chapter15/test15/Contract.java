package chapter15.test15;

public class Contract {
	private static long counter = 0;
	private final long id = counter++;
	public String toString(){
		return getClass().getName()+" "+id;
	}
}
