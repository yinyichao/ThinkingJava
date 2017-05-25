package chapter15.test15;

import java.util.ArrayList;
import java.util.List;

import chapter15.test14.SimpleQueue;

public class FillTest {
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		Fill.fill(contracts, Contract.class, 3);
		Fill.fill(contracts, TitleTransfer.class, 2);
		for (Contract c : contracts) {
			System.out.println(c);
		}
		SimpleQueue<Contract> conSimpleQueue = new SimpleQueue<Contract>();
		//The method fill(Collection<T>, Class<? extends T>, int) in the type Fill is not applicable for 
		// the arguments (SimpleQueue<Contract>, Class<Contract>, int)
		//Fill.fill(conSimpleQueue, Contract.class, 3);
	}
}
