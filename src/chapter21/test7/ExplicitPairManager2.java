package chapter21.test7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitPairManager2 extends PairManager{
	private Lock lock = new ReentrantLock();
	@Override
	public void increment() {
		Pair temp;
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			temp = getPair();
		}finally{
			lock.unlock();
		}
		store(temp);
	}
}
