package chapter13.test1;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {
	//java.lang.StackOverflowError
	/*public String toString(){
		return "InfiniteRecursion address:"+this+"\n";
	}*/
	public String toString(){
		return "InfiniteRecursion address:"+super.toString()+"\n";
	}
	public static void main(String[] args) {
		List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
		for (int i = 0; i < 10; i++) {
			v.add(new InfiniteRecursion());
		}
		System.out.println(v);
	}
}
