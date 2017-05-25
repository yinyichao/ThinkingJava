package chapter21.test7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ExplicitPairManger1 extends PairManager{
	private Lock lock = new ReentrantLock();
	@Override
	public synchronized void increment() {
		lock.lock();
		try{
			p.incrementX();
			p.incrementY();
			store(getPair());
		}finally{
			lock.unlock();
		}
	}
	
}
