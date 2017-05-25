package chapter15.test1;

public class TwoTuple<A, B> {
	public final A first;
	public final B second;
	public TwoTuple(A first, B second) {
		this.first = first;
		this.second = second;
	}
	public String toString(){
		return "("+first+","+second+")";
	}
}
