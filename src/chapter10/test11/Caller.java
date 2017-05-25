package chapter10.test11;

public class Caller {
	private Incrementable callbackReference;

	public Caller(Incrementable callbackReference) {
		this.callbackReference = callbackReference;
	}
	void go(){
		callbackReference.increment();
	}
}
