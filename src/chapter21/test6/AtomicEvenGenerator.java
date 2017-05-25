package chapter21.test6;

import java.util.concurrent.atomic.AtomicInteger;

import chapter21.test5.EvenChecker;
import chapter21.test5.IntGenerator;

public class AtomicEvenGenerator extends IntGenerator{
	private AtomicInteger currentEvenValue = new AtomicInteger(0);
	@Override
	public int next() {
		return currentEvenValue.addAndGet(2);
	}
	public static void main(String[] args) {
		EvenChecker.test(new AtomicEvenGenerator());
	}
}
