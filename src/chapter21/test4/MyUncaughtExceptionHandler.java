package chapter21.test4;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		System.out.println("caught "+e);
	}
}
