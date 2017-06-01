package chapter21.test13;

import java.util.concurrent.PriorityBlockingQueue;

public class PrioritizedTaskConsumer implements Runnable{
	private PriorityBlockingQueue<Runnable> q;
	
	public PrioritizedTaskConsumer(PriorityBlockingQueue<Runnable> q) {
		this.q = q;
	}

	@Override
	public void run() {
		try{
			while(!Thread.interrupted())
				q.take().run();
		}catch(InterruptedException e){
			
		}
		System.out.println("Finished PrioritizedTaskConsumer");
	}
	
}
