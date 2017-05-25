package chapter7.test5;

public class ReferenceCount {
	public static void main(String[] args){
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared)
		,new Composing(shared),new Composing(shared)
		,new Composing(shared),new Composing(shared)};
		for (Composing c:composing) {
			System.out.println(c.getId());
			c.dispose();
		}
	}
}
