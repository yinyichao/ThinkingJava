package chapter21.test1;

public class LiftOff implements Runnable{
	protected int countDown = 10;
	private static int taskDount = 0;
	private final int id = taskDount++;
	public LiftOff() {
	}
	public LiftOff(int countDown) {
		this.countDown = countDown;
	}
	public String status(){
		return "#" +id +"("+(countDown>0?countDown:"Liftoff!")+"),";
	}
	@Override
	public void run() {
		while(countDown-->0){
			System.out.println(status());
			Thread.yield();
		}
	}
	
}
