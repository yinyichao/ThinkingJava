package chapter15.test1;

public class FourTuple<A,B,C,D> extends ThreeTuple<A, B, C>{
	public final D fourth;

	private FourTuple(A a, B b, C third, D fourth) {
		super(a, b, third);
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return "("+first+","+second+","+third+","+fourth+")";
	}
	
}
