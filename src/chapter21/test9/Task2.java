package chapter21.test9;

public class Task2 implements Runnable{
	static Blocker blocker = new Blocker();
	@Override
	public void run() {
		blocker.waitingCall();
	}
	
}
