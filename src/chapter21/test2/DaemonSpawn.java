package chapter21.test2;

public class DaemonSpawn implements Runnable{

	@Override
	public void run() {
		while(true)
			Thread.yield();
	}
	
}
