package chapter21.test2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFormFactory implements Runnable{
	
	@Override
	public void run() {
		try{
			while(true){
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" "+this);
			}
		}catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
	public static void main(String[] args)throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++) {
			exec.execute(new DaemonFormFactory());
		}
		System.out.println("All daemon started");
		TimeUnit.MILLISECONDS.sleep(500);
	}
}
