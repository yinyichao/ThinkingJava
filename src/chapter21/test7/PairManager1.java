package chapter21.test7;

public class PairManager1 extends PairManager{
	@Override
	public void increment() {
		p.incrementX();
		p.incrementY();
		store(getPair());
	}
}
