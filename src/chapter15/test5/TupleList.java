package chapter15.test5;

import java.util.ArrayList;

import chapter15.test1.FourTuple;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>>{
	public static void main(String[] args) {
		TupleList<String,Integer,Boolean,Double> t1 = new TupleList<String, Integer, Boolean, Double>();
		//t1.add(1,("1",1,false,1.0));
	}
}
