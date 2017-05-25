package chapter7.test5;

public class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared){
		System.out.println("Creating"+this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose(){
		System.out.println("disposing"+this);
		shared.dispose();
	}
	public long getId(){
		return id;
	}
	public String toString(){
		return "Composing"+id;
	}
}
