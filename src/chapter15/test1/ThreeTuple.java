package chapter15.test1;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
	public final C third;
	
	public ThreeTuple(A a,B b,C third) {
		super(a,b);
		this.third = third;
	}

	@Override
	public String toString() {
		return "("+first+","+second+","+third+")";
	}

}
