package chapter15.test4;

import chapter15.test1.ThreeTuple;
import chapter15.test1.TwoTuple;

public class Tuple {
	public static <A,B> TwoTuple<A,B> tuple(A a,B b){
		return new TwoTuple<A,B>(a,b);
	}
	public static <A,B,C> ThreeTuple<A,B,C> tuple(A a,B b,C c){
		return new ThreeTuple<A,B,C>(a,b,c);
	}
}
